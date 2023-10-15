class Solution {
    public int numWays(int steps, int arrLen) {
        long[][] dp=new long[steps+1][steps+3];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return (int)f(0,steps,arrLen,dp);
    }
    public long f(int i,int steps,int length,long[][] dp){
        if(steps==0){
            if(i==0) return 1;
            return 0;
        }
        if(dp[i][steps]!=-1) return dp[i][steps];
        long stay=f(i,steps-1,length,dp);
        long left=0;
        long right=0;
        if(i>0){
            left=f(i-1,steps-1,length,dp);
        }
        if(i<length-1){
            right=f(i+1,steps-1,length,dp);
        }
        return dp[i][steps]=(left+right+stay)%(int)(Math.pow(10,9)+7);
    }
}