class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()+1][t.length()+1];
       
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                int not_take=dp[i-1][j];
                int take=0;
                if(s.charAt(i-1)==t.charAt(j-1)){
                    take=dp[i-1][j-1];
                }
                dp[i][j]=take+not_take;
            }
        }
        return dp[s.length()][t.length()];
    }
    public int f(String s,String t,int i,int j,int[][] dp){
        if(j<0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int not_take=f(s,t,i-1,j,dp);
        int take=0;
        if(s.charAt(i)==t.charAt(j)){
            take=f(s,t,i-1,j-1,dp);
        }
        return dp[i][j]=take+not_take;
    }
}