class Solution {
    public void merge(int[] nums, int m, int[] nums2, int n) {
        int len=n+m;
        int gap=len/2+len%2;
        if(n==0){
           return;
        }
        
        for(int i=0;i<n;i++){
            nums[i+m]=nums2[i];
        }
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if(nums[left]>nums[right]){
                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                }
                left++;
                right++;
            }
            if(gap==1){
                break;
            }
            gap=gap/2+gap%2;
        }
    }
}