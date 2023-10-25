class Solution {
    public int numberOfWays(int n, int x) {
        long[][] dp=new long[n+1][n+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        // int i=k
        int k=n;
        return (int)f(n,n,x,dp)%(int)(Math.pow(10,9)+7);
    }
    public long f(int i,int n, int k,long[][] dp){
        if(i==0){
            if(n==0) return 1;
            return 0;
        }
        if(dp[i][n]!=-1){
            return dp[i][n];
        }
        long take=0;
        if((int)Math.pow(i,k)<=n){
            take=f(i-1,n-(int)Math.pow(i,k),k,dp);
        }
        long not_take=f(i-1,n,k,dp);
        return dp[i][n]=(take+not_take)%(int)(Math.pow(10,9)+7);
    }
}