class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()){
            return "0";
        }
        Stack<Character>s=new Stack<>();
        for(int i=0;i<num.length();i++){
            char a=num.charAt(i);
            while(!s.isEmpty()&&k>0&&a<s.peek()){
                k--;
                s.pop();
            }
            s.push(a);
        }
        while(!s.isEmpty()&&k>0){
            s.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        sb.reverse();

        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();

    }
}