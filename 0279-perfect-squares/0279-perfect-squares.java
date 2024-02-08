class Solution {
    public int numSquares(int n) {
        int i=(int)Math.pow(n,0.5);
        int[][] dp=new int[i+1][n+1];
        for(int j=0;j<=i;j++){
            Arrays.fill(dp[j],-1);
        }
        return f(i,n,dp);
    }
    public int f(int i,int n,int[][] dp){
        if(i==1) return n;
        if(dp[i][n]!=-1) return dp[i][n];
        int not_take=f(i-1,n,dp);
        int take=10000;
        if((int)(Math.pow(i,2))<=n){
            take=1+f(i,n-(int)Math.pow(i,2),dp);
        }
        return dp[i][n]=Math.min(take,not_take);
    }
}