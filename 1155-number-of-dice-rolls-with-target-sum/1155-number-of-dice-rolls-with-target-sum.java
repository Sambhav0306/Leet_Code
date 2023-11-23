class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        long[][] dp=new long[n+1][target+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=f(n,k,target,dp); 
        return (int)(ans%1000000007);
    }
    public long f(int n,int k,int target,long[][] dp){
        if(n==0){
            if(target==0) return 1;
            return 0;
        }
        if(dp[n][target]!=-1) return dp[n][target];
        long add=0;
        for(int i=1;i<=k;i++){
            if(i>target) break;
            add+=f(n-1,k,target-i,dp);
        }
        return dp[n][target]=add%1000000007;
    }
}