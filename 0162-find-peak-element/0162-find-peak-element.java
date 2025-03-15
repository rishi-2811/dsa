class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        return findPeakRecursive(nums, 0, nums.length - 1);
    }
    
    private int findPeakRecursive(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        
        if (mid == 0) {
            if (nums[mid] > nums[1]) {
                return 0;
            } else {
                return findPeakRecursive(nums, mid + 1, high);
            }
        } else if (mid == nums.length - 1) {
            if (nums[mid] > nums[mid - 1]) {
                return mid;
            } else {
                return findPeakRecursive(nums, low, mid - 1);
            }
        } else if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
            return mid;
        } else if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
            return Math.max(findPeakRecursive(nums, low, mid - 1), findPeakRecursive(nums, mid + 1, high));
        } else if (nums[mid] < nums[mid - 1] && nums[mid] > nums[mid + 1]) {
            return findPeakRecursive(nums, low, mid - 1);
        } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
            return findPeakRecursive(nums, mid + 1, high);
        } 
        
        return mid;
    }
}
