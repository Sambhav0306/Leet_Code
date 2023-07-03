class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return f(nums,nums.length-1,dp);
    }
    public int f(int[] nums,int ind,int[] dp){
        if(ind==0){
            return nums[0];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int tp=nums[ind]+f(nums,ind-2,dp);
        int not_tp=0+f(nums,ind-1,dp);
        return dp[ind]=Math.max(tp,not_tp);
    }
}