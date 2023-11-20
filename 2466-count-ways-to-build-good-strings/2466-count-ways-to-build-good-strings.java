class Solution {
    int m=1000000007;
    public  int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp=new int[high+1];
        Arrays.fill(dp,-1);
        return f(0,low,high,zero,one,dp);
    }
    public  int f(int i,int low,int high,int zero,int one,int[] dp){
        if(i>high) return 0;
        int ones=0;
        if(dp[i]!=-1) return dp[i];
//        int zeros=0;
        if(i>=low){
            ones=(1+f(i+one,low,high,zero,one,dp)+f(i+zero,low,high,one,zero,dp))%m;
        }else{
            ones=(f(i+one,low,high,zero,one,dp)+f(i+zero,low,high,zero,one,dp))%m;
        }
        return dp[i]=ones;
    }
}