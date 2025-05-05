class Solution {
    public int divide(int dividend, int divisor) {
        boolean neg=false;
        if(dividend<0 && divisor<0){
            neg=false;
        }
        else if(dividend<0 || divisor<0){
            neg=true;
        }
        boolean div=dividend<0;
        if(divisor==Integer.MIN_VALUE){
            if(dividend==Integer.MIN_VALUE){
                return 1;
            }
            else{
                return 0;
            }
        }

        dividend=dividend<0?dividend==Integer.MIN_VALUE?-(dividend+1):-dividend:dividend;
        divisor=divisor<0?divisor==Integer.MIN_VALUE?-(divisor+1):-divisor:divisor;
        
        if(divisor==1){
            return neg==true?dividend==Integer.MAX_VALUE && div?-dividend-1:-dividend:dividend;
        }
        int count=0;
        if(dividend==Integer.MAX_VALUE && isPowerOfTwo(divisor) && div){
            count=1;
        }
        while(dividend>=divisor){
            long temp=divisor;
            
            int multiple=1;
            while(dividend>=temp){
            temp=temp<<1;
            multiple=multiple<<1;
        }
        multiple=multiple>>1;
        temp=temp>>1;
        count+=multiple;
        dividend-=temp;
        }
        int answer=count;
        
        return neg==true?-answer:answer;
    }
    public boolean isPowerOfTwo(int n) {
        int m=n-1;

        if(n<=0){
            return false;
        }
        return (m &n)==0;
    }
}