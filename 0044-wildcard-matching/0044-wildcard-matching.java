class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp=new int[s.length()][p.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,0,s,p,dp);
    }
    public boolean f(int i,int j,String s,String p,int[][] dp){
        if(j==p.length() && i<s.length()) return false;
        if(i>=s.length()){
            if(j==p.length()) return true;
            if(p.charAt(j)=='*'){
                for(int k=j;k<p.length();k++){
                    if(p.charAt(k)!='*') return false;
                }
                return true;
            }
            return false;
        }
        if(dp[i][j]!=-1){
            if(dp[i][j]==0) return false;
            else return true;
        }
        boolean same=false;
        boolean mark=false;
        boolean star=false;
        if(s.charAt(i)==p.charAt(j)) same=f(i+1,j+1,s,p,dp);
        if(p.charAt(j)=='?') mark=f(i+1,j+1,s,p,dp);
        if(p.charAt(j)=='*'){
            for(int k=0;k<=s.length();k++){
                star=star|f(i+k,j+1,s,p,dp);
            }
        }
        boolean ans= mark|same|star;
        if(ans) dp[i][j]=1;
        else dp[i][j]=0;
        return ans;
    }
}