class Solution {
    public int numberOfWays(int start, int end, int k) {
        int[][] dp=new int[5000][k+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(end,start,k,dp)%(int)(Math.pow(10,9)+7);
    }
    public int f(int i,int start,int k,int[][] dp){
        if(k==0){
            if(i==start){
                return 1;
            }
            return 0;
        }
        if(dp[i+1000][k]!=-1){
            return dp[i+1000][k];
        }
        int left=f(i-1,start,k-1,dp);
        int right=f(i+1,start,k-1,dp);
        return dp[i+1000][k]=(left+right)%(int)(Math.pow(10,9)+7);
    }
}