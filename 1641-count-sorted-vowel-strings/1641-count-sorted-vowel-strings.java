class Solution {
    public int countVowelStrings(int n) {
        char[] nums={'a','e','i','o','u'};
        int[][] dp=new int[5][n+1];
        for(int i=0;i<5;i++){
            Arrays.fill(dp[i],-1);
        }
        StringBuilder str=new StringBuilder();
        return f(0,n,dp);
    }
    public int f(int i,int n,int[][]dp){
        if(n==0){
            return 1;
        }
        if(dp[i][n]!=-1) return dp[i][n];
        int ans=0;
        for(int j=i;j<5;j++){
            ans+=f(j,n-1,dp);
        }
        return dp[i][n]=ans;
    }
}