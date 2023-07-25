class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(coins.length-1,amount,coins,dp);
    }
    public int f(int ind,int amount,int[] coins,int[][] dp){
        if(ind==0){
            if(amount==0 || amount%coins[0]==0){
                return 1;
            }
            return 0;
        }
        if(dp[ind][amount]!=-1){
            return dp[ind][amount];
        }
        int not_take=f(ind-1,amount,coins,dp);
        int take=0;
        if(amount>=coins[ind]){
            take=f(ind,amount-coins[ind],coins,dp);
        }
        return dp[ind][amount]=take+not_take;
    }
}