import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int var1=0;
        int count1=0;
        int var2=0;
        int count2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count1==0 &&nums[i]!=var2){
                var1=nums[i];
                count1++;
            }

            else if(count2==0 &&nums[i]!=var1){
                var2=nums[i];
                count2++;
            }
            else if(nums[i]==var1 ){
                count1++;
            }
            else if(nums[i]==var2){
                count2++;
            }
            else{
                
                    count1--;
                
                
                    count2--;
                
            }
        }
        count1=0;
        count2=0;
        for(int j=0;j<n;j++){
            if(nums[j]==var1){
                count1++;
            }
            else if(nums[j]==var2){
                count2++;
            }
        }
        if(count1>n/3){
            ans.add(var1);
        }
        if(count2>n/3){
            ans.add(var2);
        }
        return ans;
    }
}