class Solution {
    public boolean canJump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return f(0,nums,dp);
    }
    public boolean f(int ind,int[] nums,int[] dp){
        if(ind==nums.length-1){
            return true;
        }
        if(nums[ind]==0){
            return false;
        }
        if(dp[ind]!=-1){
            if(dp[ind]==1) return true;
            return false;
        }
        for(int i=1;i<=nums[ind] && ind+i<nums.length;i++){
            if(f(ind+i,nums,dp)){
                dp[ind]=1;
                return true;
            }
        }
        dp[ind]=0;
        return false;
    }
}