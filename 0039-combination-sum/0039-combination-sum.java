class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int k) {
        List<Integer> s=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        getAnswer(answer,s,nums,0,0,k);
        return answer;
    }
    public static void getAnswer(List<List<Integer>> answer,List<Integer> s,int[] nums,int i,int sum,int k){
    
        if(i==nums.length){
            if(sum==k){
                answer.add(s);
            }
        }
        else{
            List<Integer> a=new ArrayList<>(s);
            getAnswer(answer,a,nums,i+1,sum,k);
            while(sum<k){
                sum+=nums[i];
                a.add(nums[i]);
                getAnswer(answer,a,nums,i+1,sum,k);
            }
            
            
        }
    }
}