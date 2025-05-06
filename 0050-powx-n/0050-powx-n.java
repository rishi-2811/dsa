class Solution {
    public double myPow(double x, int n) {
        boolean neg=x<0 && n%2!=0;
        boolean powneg=n<0;
        long n1=powneg?n==Integer.MIN_VALUE?-(n+1):-n:n;
        x=x<0?-x:x;
        if(x==0){
            return 0;
        }
        if(x==1){
            return neg?-1:1;
        }
        if(n1==1){
            return powneg?1/x:x;
        }
        if(n1==0){
            return 1;
        }
        System.out.println(n1);
        double answer=getAnswer(x,n1);
        answer=powneg?1/answer:answer;
        answer=neg?-answer:answer;
        return answer;
    }
    public double getAnswer(double x,long n){
        if(n==1){
            return x;
        }
        if(n%2!=0){
            return x*getAnswer(x*x,(n-1)/2);
        }
        if(n%2==0){
            return getAnswer(x*x,n/2);
        }
        return 1;
    }
}