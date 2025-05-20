class Solution {
    public List<List<String>> partition(String s) {
        
        List<String> a=new ArrayList<>();
        List<List<String>> answer=new ArrayList<>();
        getAnswer(answer,a,s,0,1);
        return answer;
    }
    public static void getAnswer(List<List<String>> answer,List<String> a,String s,int l,int r){
        if(l==s.length()){
            answer.add(new ArrayList<>(a));
            return;
        }
        else{
            String b=r>=s.length()?s.substring(l):s.substring(l,r);
            
            if(isPalindrome(b)){
                a.add(b);
                getAnswer(answer,a,s,r,r+1);
                a.remove(a.size() - 1);
            }

            if(r!=s.length()){
                getAnswer(answer,a,s,l,r+1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
    }
}