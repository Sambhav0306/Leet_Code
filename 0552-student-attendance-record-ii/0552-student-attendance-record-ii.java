class Solution {
    public int checkRecord(int n) {
        long[][][] dp=new long[n][2][3];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i][0],-1);
            Arrays.fill(dp[i][1],-1);
        }
        long ans=f(n-1,0,0,dp);
        int a=(int)(ans%(Math.pow(10,9)+7));
        return a;
    }
    public long f(int n,int a,int b,long[][][] dp){
        if(n==-1) return 1;
        if(dp[n][a][b]!=-1) return dp[n][a][b];
        long p=f(n-1,a,0,dp);
        long A=0;
        long l=0;
        if(a<1) A=f(n-1,a+1,0,dp);
        if(b!=2) l=f(n-1,a,b+1,dp);
        return dp[n][a][b]=(p+A+l)%(long)(Math.pow(10,9)+7);
    }
}