class Solution {
    public int minSteps(int n) {
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(1,0,n,0,dp);
    }
    public int f(int i,int k,int n,int check,int[][] dp){
        if(i>n){
            return 2000;
        }
        if(dp[i][k]!=-1) return dp[i][k];
        if(i==n) return 0;
        int copy=2000;
        if(i<=n/2 && check==0){
            copy=1+f(i,i,n,1,dp);
        }
        int paste=2000;
        if(k>0){
            paste=1+f(i+k,k,n,0,dp);
        }
        return dp[i][k]=Math.min(copy,paste);
    }
}