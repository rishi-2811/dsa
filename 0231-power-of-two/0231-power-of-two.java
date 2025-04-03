class Solution {
    public boolean isPowerOfTwo(int n) {
        int m=n-1;

        if(n<=0){
            return false;
        }
        return (m &n)==0;
    }
}