class Solution {
    int count;
    Integer memo[];
    public int jump(int[] nums) {
        memo=new Integer[nums.length];
        if(nums.length<=1){
            return 0;
        }
        count=nums.length;
        jump(nums,0); 
        return count;      
    }
    public int jump(int[] nums,int si) {
        if(si>=nums.length-1){
           return 0;
        } 
        if(memo[si]!=null){
            return memo[si];
        }
        for(int j=1; j<=nums[si] ; j++){
            count=Math.min(count,1+jump(nums,si+j));      
        } 
        return memo[si]=count;  
    }
}