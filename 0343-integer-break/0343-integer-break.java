class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);
    }
    public int f(int n,int[] dp){
        if(n<=0){
            return 1;
        }
        int max=0;
        if(dp[n]!=-1) return dp[n];
        for(int i=n;i>0;i--){
            int maxi=i*f(n-i,dp);
            max=Math.max(max,maxi);
        }
        return dp[n]=max;
    }
}