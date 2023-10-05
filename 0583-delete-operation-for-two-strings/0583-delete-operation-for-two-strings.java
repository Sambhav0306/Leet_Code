class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(word1.length()-1,word2.length()-1,word1,word2,dp);
    }
    public int f(int i,int j,String s, String t,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        int same=1000;
        int first=1000;
        int second=1000;
        if(s.charAt(i)==t.charAt(j)){
            same=f(i-1,j-1,s,t,dp);
        }
        first=1+f(i-1,j,s,t,dp);
        second=1+f(i,j-1,s,t,dp);
        return dp[i][j]=Math.min(same,Math.min(first,second));
    }
}