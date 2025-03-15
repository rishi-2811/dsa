class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int []ans={-1,-1};
        BinarySearch(nums,ans,target,low,high);
        return ans;
    }
    public void BinarySearch(int []nums,int []ans,int target,int low,int high){
        int mid=(low+high)/2;
        if(low>high){
           return;
        }
        else{
            if(nums[mid]==target){
                if(ans[0]==-1){
                    ans[0]=mid;
                }
                if(nums[low]==nums[high]){
                    if(low<ans[0]){
                        ans[0]=low;
                    }
                     if(high>ans[1]){
                        ans[1]=high;
                    }
                }
                else{
                    if(mid<ans[0]){
                        ans[0]=mid;
                    }
                     if(mid>ans[1]){
                        ans[1]=mid;
                    }
                }
                BinarySearch(nums,ans,target,low,mid-1);
                BinarySearch(nums,ans,target,mid+1,high);
            }
            else if(nums[mid]<target){
                BinarySearch(nums,ans,target,mid+1,high);
            }
            else{
                BinarySearch(nums,ans,target,low,mid-1);
            }
        }
    }
}