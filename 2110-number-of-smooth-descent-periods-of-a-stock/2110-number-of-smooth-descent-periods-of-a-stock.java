class Solution {
    public long getDescentPeriods(int[] prices) {
        long total=0;
        long[] dp=new long[prices.length];
        Arrays.fill(dp,-1);
        for(int i=prices.length-1;i>=0;i--){
            total+=f(i,prices,dp);
        }
        return total;
    }
    public long f(int i,int[] arr,long[] dp){
        if(i<0) return 0;
        long ans=1;
        if(dp[i]!=-1) return dp[i];
        if(i-1>=0 && arr[i-1]-arr[i]==1){
            ans+=f(i-1,arr,dp);
        }
        return dp[i]=ans;
    }
}