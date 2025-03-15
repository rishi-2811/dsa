import java.util.*;
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid;
        int min=Integer.MAX_VALUE;
        if(nums[low]<nums[high]){
            return nums[low];
        }
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]<min){
                min=nums[mid];
            }
            if(nums[low]<nums[high]){
                if(nums[low]<min){
                    min=nums[low];
                }
                break;
            }
            else if(nums[mid]>=nums[low]){
                low=mid+1;
            }
            else{
               high=mid-1;
            }
        }
        return min;
    
    }
}