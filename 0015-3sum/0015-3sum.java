class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Set<Integer> memory=new HashSet<>();
        
        for(int i=0;i<nums.length-1;i++){
           
            for(int j=i+1;j<nums.length;j++){
                int target=0-(nums[i]+nums[j]);
                if( memory.contains(target)){
                    
                        Integer a[]={nums[i],nums[j],target};
                        Arrays.sort(a);
                        ans.add(Arrays.asList(a));
                        
                }
                
            }
            memory.add(nums[i]);
            
        }
        List<List<Integer>> a=new ArrayList<>(ans);
        
        return a;
    }
}