class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            
            while(!s.isEmpty() && nums2[i]>s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                s.push(nums2[i]);
                mp.put(nums2[i],-1);
                continue;
            }
            mp.put(nums2[i],s.peek());
            s.push(nums2[i]);
        }
        int[] ans=new int[nums1.length];
        for(int j=0;j<nums1.length;j++){
            ans[j]=mp.get(nums1[j]);
        }
        return ans;
    }
}