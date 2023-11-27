class Solution {
    public int knightDialer(int n) {
        if(n==1) return 10;
        int[][] nums=new int[][]{
            {4, 6},
        {6, 8},
        {7, 9},
        {4, 8},
        {3, 9, 0},
        {},
        {1, 7, 0},
        {2, 6},
        {1, 3},
        {2, 4}
        };
        int ans=0;
        int[][] dp=new int[n+1][10];
        for(int i=0;i<=9;i++){
            ans=(ans+f(i,nums,n-1,dp))%1000000007;
        }
        return (int)ans;
    }
    public int f(int i,int[][] nums,int n,int[][] dp){
        if(n==0) return 1;
        if(dp[n][i]!=0) return dp[n][i];
        int ans=0;
        for(int j=0;j<nums[i].length;j++){
            // if(nums[i][j]==-1) break;
            ans=(ans+f(nums[i][j],nums,n-1,dp))%1000000007;
        }
        return dp[n][i]=ans;
    }
}