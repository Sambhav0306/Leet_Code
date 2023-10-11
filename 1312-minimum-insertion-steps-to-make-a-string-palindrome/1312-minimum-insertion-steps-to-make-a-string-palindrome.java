class Solution {
    public int minInsertions(String s) {
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
       return f(0,s.length()-1,s,dp);
    }
    static int f(int i,int j,String s,int[][] dp){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int same=Integer.MAX_VALUE;
        int up=Integer.MAX_VALUE;
        int down=Integer.MAX_VALUE;
        if(s.charAt(i)==s.charAt(j)){
            same=f(i+1,j-1,s,dp);
        }
        up=1+f(i+1,j,s,dp);
        down=1+f(i,j-1,s,dp);
        return dp[i][j]=Math.min(same,Math.min(up,down));
    }
}