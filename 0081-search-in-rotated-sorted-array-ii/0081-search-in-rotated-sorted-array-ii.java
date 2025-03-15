class Solution {
    public boolean search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private boolean binarySearch(int[] nums, int target, int low, int high) {
        if (low > high) {
            return false;
        }
        
        int mid = (low + high) / 2;
        
        if (nums[mid] == target) {
            return true;
        }
        
        if (nums[mid] > target) {
            if (nums[low] < nums[high]) {
                return binarySearch(nums, target, low, mid - 1);
            } else if (nums[low] == nums[high] && nums[low] == nums[mid]) {
                return binarySearch(nums, target, low, mid - 1) || binarySearch(nums, target, mid + 1, high);
                
            } else if (nums[mid] < nums[low]) {
                return binarySearch(nums, target, low, mid - 1);
            } else {
                if (target >= nums[low]) {
                    return binarySearch(nums, target, low, mid - 1);
                } else {
                    return binarySearch(nums, target, mid + 1, high);
                }
            }
        } else {
            if (nums[low] < nums[high]) {
                return binarySearch(nums, target, mid + 1, high);
            } else if (nums[low] == nums[high] && nums[low] == nums[mid]) {
                return binarySearch(nums, target, low, mid - 1) || binarySearch(nums, target, mid + 1, high);
                
            } else if (nums[mid] < nums[low]) {
                if (target > nums[high]) {
                    return binarySearch(nums, target, low, mid - 1);
                } else {
                    return binarySearch(nums, target, mid + 1, high);
                }
            } else {
                return binarySearch(nums, target, mid + 1, high);
            }
        }
    }
}
