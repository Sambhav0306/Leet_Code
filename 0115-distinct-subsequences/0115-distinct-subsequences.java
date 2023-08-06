class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(s,t,s.length()-1,t.length()-1,dp);
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