import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer>pre=new HashMap<>();
        int presum=0;
        int count=0;
        pre.put(presum,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            if (pre.containsKey(presum-k)){
                count+=pre.get(presum-k);
            }
            if(pre.containsKey(presum)){
                pre.put(presum,pre.get(presum)+1);
            }
            else{
                pre.put(presum,1);
            }
        }
        return count;
    }
}