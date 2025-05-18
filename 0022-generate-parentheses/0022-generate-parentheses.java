class Solution {
    public List<String> generateParenthesis(int n) {
        String s="";
        List<String> answer=new ArrayList<>();
        getAnswer(answer,s,n,0,0);
        return answer;
    }
    public static void getAnswer(List<String> answer,String s,int n,int a1,int a2){
        if(s.length()==2*n){
            answer.add(s);
        }
        else{
            if(a1<n){
                StringBuilder a=new StringBuilder(s);
                a.append('(');
                getAnswer(answer,a.toString(),n,a1+1,a2);
            }
            if(a2<a1){
                StringBuilder b=new StringBuilder(s);
                b.append(')');
                getAnswer(answer,b.toString(),n,a1,a2+1);
            }
        }
    }
}