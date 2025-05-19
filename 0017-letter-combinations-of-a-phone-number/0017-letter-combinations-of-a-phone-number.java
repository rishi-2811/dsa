class Solution {
    private static final Map<Character, Character> DIGIT_TO_CHAR;

    static {
        Map<Character, Character> map = new HashMap<>();
        map.put('2', 'a');
        map.put('3', 'd');
        map.put('4', 'g');
        map.put('5', 'j');
        map.put('6', 'm');
        map.put('7', 'p');
        map.put('8', 't');
        map.put('9', 'w');
        DIGIT_TO_CHAR = Collections.unmodifiableMap(map); 
    }
    public List<String> letterCombinations(String digits) {
        String s="";
        List<String> answer=new ArrayList<>();
        if(digits.isEmpty()){
            return answer;
        }
        getAnswer(answer,s,digits,0);
        return answer;
    }
    public static void getAnswer(List<String> answer,String s,String k,int i){
        if(s.length()==k.length()){
            answer.add(s);
        }
        
        else{
            char ch=k.charAt(i);
            if(ch<'2' || ch>'9'){
                getAnswer(answer,s,k,i+1);
            }
            else{
                StringBuilder a=new StringBuilder(s);
            a.append(DIGIT_TO_CHAR.get(k.charAt(i)));
            getAnswer(answer,a.toString(),k,i+1);
            
            StringBuilder b=new StringBuilder(s);
            b.append((char)(DIGIT_TO_CHAR.get(k.charAt(i))+1));
            getAnswer(answer,b.toString(),k,i+1);

            StringBuilder c=new StringBuilder(s);
            c.append((char)(DIGIT_TO_CHAR.get(k.charAt(i))+2));
            getAnswer(answer,c.toString(),k,i+1);

            if(ch=='7' || ch=='9'){
                StringBuilder d=new StringBuilder(s);
            d.append((char)(DIGIT_TO_CHAR.get(k.charAt(i))+3));
            getAnswer(answer,d.toString(),k,i+1);
            }
            
            }
        }
    }
}