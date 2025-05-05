class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        int sieve[]=new int[n];
        for(int a:sieve){
            a=0;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(sieve[i]==0){
                for(int j=i;j*i<n;j++){
                    sieve[j*i]=1;
                }
            }
        }
        int count=0;
        for(int b=2;b<n;b++){
            if(sieve[b]==0){
                count++;
            }
        }
        return count;
    }
}