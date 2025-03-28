class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0; 
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            sum+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        int low=min;
        int high=sum;
        int mid;
        int ans=Integer.MAX_VALUE;
        if(k==1){
            return sum;
        }
        if(k==nums.length){
            return max;
        }
        while(low<=high){
           mid=(low+high)/2;
           int []temp=get(nums,mid);
           if(temp[0]==k){
             ans=Math.min(ans,temp[1]);
             high=mid-1;
           }
           else if(temp[0]>k){
            low=mid+1;
           }
           else{
            high=mid-1;
           }
        }
        if(ans==Integer.MAX_VALUE){
            return max;
        }
        else{
            return ans;
        }
    }
    public int[] get(int[] nums, int mid) {
    int[] ans = new int[2];
    int maxsum = 0;
    int k = 1;
    int sum = 0;

    for (int num : nums) {
        if (sum + num >= mid) { 
            maxsum = Math.max(maxsum, sum);
            sum = num;
            k++;
        } else {
            sum += num;
        }
        
    }
    maxsum = Math.max(maxsum, sum);

    ans[0] = k;
    ans[1] = maxsum;
    return ans;
}

}