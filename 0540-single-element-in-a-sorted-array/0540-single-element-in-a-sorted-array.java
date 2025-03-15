class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
           if(low==high){
            return nums[low];
           }
           mid=(low+high)/2;
           if(nums[mid]==nums[mid-1]){
            if((mid-low-1)%2==0){
                low=mid+1;
            }
            else{
                high=mid-2;
            }
           }
           else if(nums[mid]==nums[mid+1]){
            if((high-mid-1)%2==0){
                high=mid-1;
            }
            else{
                low=mid+2;
            }
           }
           else{
            return nums[mid];
           }
        }
        return nums[mid];
    }
}