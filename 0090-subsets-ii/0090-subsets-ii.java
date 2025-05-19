class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> s=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        getAnswer(answer,s,nums,0);
        return answer;
    }
    public static void getAnswer(List<List<Integer>> ans,List<Integer> ds,int[] arr,int ind){
        ans.add(new ArrayList < > (ds));
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            

            ds.add(arr[i]);
            getAnswer(ans, ds, arr,i + 1);
            ds.remove(ds.size() - 1);
        }
        }
}