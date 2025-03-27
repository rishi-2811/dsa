class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            long k=eatingBanana(piles,mid);
            if(k<=h){
                high=mid-1;
                ans=Math.min(ans,mid);
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public long eatingBanana(int[] piles, int k){
        long sum=0;
        long a=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%k==0){
                a=piles[i]/k;
            }
            else{
                a=piles[i]/k+1;
            }
            sum+=a;
        }
        
        return sum;
    }
}