class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev=0;
        int prev2=0;
        for(int i=2;i<=cost.length;i++){
        int fs=prev+cost[i-1];
        int ss=Integer.MAX_VALUE;
        if(i>1){
            ss=prev2+cost[i-2];
        }
            int curr=Math.min(fs,ss);
            prev2=prev;
            prev=curr;
        }
        // int ans=recur(cost,cost.length,dp);
        return prev;
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