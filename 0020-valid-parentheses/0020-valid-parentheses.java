class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> s1=new Stack<>();
        

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                s1.push('(');
            }
            else if(ch=='['){
                
                s1.push('[');
            }
            else if(ch=='{'){
                
                s1.push('{');
            }
            else if(ch==')'){
                if(s1.isEmpty()){
                    return false;
                }
                char c=s1.pop();
                if(c!='('){
                    return false;
                }
            }
            else if(ch==']'){
                 if(s1.isEmpty()){
                    return false;
                }
                char c=s1.pop();
                if(c!='['){
                    return false;
                }
            }
            else if(ch=='}'){
                 if(s1.isEmpty()){
                    return false;
                }
                char c=s1.pop();
                if(c!='{'){
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
}