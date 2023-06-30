class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        for(int i=2;i<=cost.length;i++){
        int fs=dp[i-1]+cost[i-1];
        int ss=Integer.MAX_VALUE;
        if(i>1){
            ss=dp[i-2]+cost[i-2];
        }
            dp[i]=Math.min(fs,ss);
        }
        // int ans=recur(cost,cost.length,dp);
        return dp[dp.length-1];
    }
    public int recur(int[] arr,int i,int[] dp){
        if(i==0|| i==1){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        int fs=recur(arr,i-1,dp)+arr[i-1];
        int ss=Integer.MAX_VALUE;
        if(i>1){
            ss=recur(arr,i-2,dp)+arr[i-2];
        }
        return dp[i]=Math.min(fs,ss);
    }
}