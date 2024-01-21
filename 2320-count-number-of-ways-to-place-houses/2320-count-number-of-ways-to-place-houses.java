class Solution {
     long[] dp;
    public int countHousePlacements(int n) {
        dp = new long[n+1];
        Arrays.fill(dp,-1);
        solve(n);
        long ans = dp[n];
        
        return (int)((ans*ans)%1000000007);
    }
    
    public long solve(int n){
        if(n<=0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        long count=0;
        
        count+= 1L*solve(n-2);

        count+= 1L*solve(n-1);
        
        return dp[n] = count % 1000000007;
    }
    
}