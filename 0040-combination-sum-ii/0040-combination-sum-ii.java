class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int k) {
        List<Integer> s=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        getAnswer(answer,s,nums,0,k);
        return answer;
    }
    public static void getAnswer(List<List<Integer>> ans,List<Integer> ds,int[] arr,int ind,int target){
    if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            getAnswer(ans, ds, arr,i + 1, target - arr[i]);
            ds.remove(ds.size() - 1);
        }
        }
    }
