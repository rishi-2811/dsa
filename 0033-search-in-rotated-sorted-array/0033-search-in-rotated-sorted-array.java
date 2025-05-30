class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                if(nums[low]<nums[high]){
                    high=mid-1;
                }
                else if(nums[low]>nums[high] && nums[mid]<nums[low]){
                    high=mid-1;
                }
                else{
                    if(target>=nums[low]){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
            }
            else{
                if(nums[low]<nums[high]){
                    low=mid+1;
                }
                else if(nums[low]>nums[high] && nums[mid]<nums[low]){
                    if(target>nums[high]){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}