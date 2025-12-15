class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long ans=0;
        int i=0;
        int curr=prices[i];
        
        while(i<n){
            int c=1;
            curr=prices[i];
            i++;
            while(i<n&&curr-1==prices[i]){
                curr=prices[i++];
                c++;
            }
           
            long mul=0;
            while(c>0){
                mul+=c;
                c--;
            }
            ans+=mul;
        }
        return ans;
    }
}