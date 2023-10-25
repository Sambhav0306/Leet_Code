class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int[][] dp=new int[satisfaction.length+1][satisfaction.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,1,satisfaction,dp);
    }
    public int f(int i,int k,int[] nums,int[][] dp){
        if(i==nums.length) return 0;
        if(dp[i][k]!=-1) return dp[i][k];
        int not_take=f(i+1,k,nums,dp);
        int take=nums[i]*k + f(i+1,k+1,nums,dp);
        return dp[i][k]=Math.max(take,not_take);
    }
}