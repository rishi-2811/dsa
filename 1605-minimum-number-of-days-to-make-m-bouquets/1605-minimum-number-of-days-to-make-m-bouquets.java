import java.math.BigInteger;
class Solution {
    public int minDays(int[] piles, int m, int k) {
        long h = (long) m * k;
        if(h>piles.length){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
            min=Math.min(min,piles[i]);
        }
        int low=min;
        int high=max;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(makeBouquet(piles,m,k,mid)){
                high=mid-1;
                ans=Math.min(ans,mid);
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean makeBouquet(int[] piles,int m, int k,int mid){
        int i=0,j=0;
        int count=0;
        while(i<=j && j<piles.length){
            if(count==m){
                return true;
            }
            if(piles[j]<=mid){
               if(j-i+1==k){
                count++;
                i=j+1;
                j++;
            }
            else{
                j++;
            }

            }
            else{
                i=j+1;
                j++;
            }
            
        }
        return count==m;
    }
}