class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> s=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        getAnswer(ans,s,nums.length);
        for(List<Integer> a:ans){
            List<Integer> b=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                int c=a.get(i);
                if(c==1){
                    b.add(nums[i]);
                }
            }
            answer.add(b);
        }
        return answer;
    }
    public static void getAnswer(List<List<Integer>> answer,List<Integer> s,int n){
        if(s.size()==n){
            answer.add(s);
        }
        else{
            List<Integer> a=new ArrayList<>(s);
            a.add(0);
            getAnswer(answer,a,n);
            List<Integer> b=new ArrayList<>(s);
            b.add(1);
            getAnswer(answer,b,n);
            
        }
    }
}