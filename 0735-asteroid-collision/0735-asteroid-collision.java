class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<nums.length;i++){
            collison(s,nums[i]);
        }
        int []ans=new int[s.size()];
        while(!s.isEmpty()){
            ans[s.size()-1]=s.peek();
            s.pop();
        }
        return ans;
    }
    public void collison(Stack<Integer> s,int a){
        if(s.isEmpty()){
            s.push(a);
            return ;
        }
        if(s.peek()>0 &&a<0){
            if(Math.abs(a)==s.peek()){
                s.pop();
            }
            else if((Math.abs(a)>s.peek())){
                s.pop();
                collison(s,a);
            }
            else{
                return ;
            }
        }
        else{
            s.push(a);
        }
    }
}