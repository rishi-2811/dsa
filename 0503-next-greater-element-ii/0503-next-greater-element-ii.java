class Solution {
    public int[] nextGreaterElements(int[] nums2) {
        int[] ans=new int[nums2.length];
        int n=nums2.length;
        Stack<Integer> s=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            
            while(!s.isEmpty() && nums2[i%n]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                s.push(nums2[i%n]);
                ans[i%n]=-1;
                continue;
            }
            ans[i%n]=s.peek();
            s.push(nums2[i%n]);
        }
        return ans;
    }
}