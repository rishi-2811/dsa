class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> s=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        int[] nums={1,2,3,4,5,6,7,8,9};
        getAnswer(answer,s,nums,0,k,n,0);
        return answer;
    }
    public static void getAnswer(List<List<Integer>> answer,List<Integer> s,int[] nums,int i,int k,int n,int sum){
        if(k==0){
            if(sum==n){
                answer.add(s);
            }
            return;
        }
        if(i==nums.length){
            return ;
        }
        else{
            List<Integer> a=new ArrayList<>(s);
            
            getAnswer(answer,a,nums,i+1,k,n,sum);
            if(sum+nums[i]<=n){
                List<Integer> b=new ArrayList<>(s);
                b.add(nums[i]);
                getAnswer(answer,b,nums,i+1,k-1,n,sum+nums[i]);
            }
            
        }
    }
}