class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        int ans=-1;
        
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    return mid;
                }
                if(mid>ans){
                    ans=mid;
                }
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            
        }
        return ans+1;
    }
}