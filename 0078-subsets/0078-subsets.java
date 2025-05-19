class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> s=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        getAnswer(answer,s,nums,0);
        // for(List<Integer> a:ans){
        //     List<Integer> b=new ArrayList<>();
        //     for(int i=0;i<nums.length;i++){
        //         int c=a.get(i);
        //         if(c==1){
        //             b.add(nums[i]);
        //         }
        //     }
        //     answer.add(b);
        
        return answer;
    }
    public static void getAnswer(List<List<Integer>> answer,List<Integer> s,int[] nums,int i){
        if(i==nums.length){
            answer.add(s);
        }
        else{
            List<Integer> a=new ArrayList<>(s);
            
            getAnswer(answer,a,nums,i+1);
            List<Integer> b=new ArrayList<>(s);
            b.add(nums[i]);
            getAnswer(answer,b,nums,i+1);
            
        }
    }
}