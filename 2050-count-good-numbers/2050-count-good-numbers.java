class Solution {
    public int countGoodNumbers(long n) {
        int mod = 1000000007;
        if(n==1){
            return 5;
        }
        long oddpos=n/2;
        long evenpos=n%2==0?n/2:n/2+1;
        long result=(answer(4,oddpos,mod)*answer(5,evenpos,mod))%mod;
        
        return (int)result;
    }
    public long answer(int x,long n,int mod){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
        long half=answer(x,n/2,mod);
        long result=(half*half)%mod;
        if(n%2!=0){
            result=(x*result)%mod;
        }
        return result;
    }
}