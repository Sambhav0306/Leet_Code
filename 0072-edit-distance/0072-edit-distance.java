class Solution {
    public int minDistance(String word1, String word2) {
     int[][] dp=new int[word1.length()+1][word2.length()+1];
     for(int i=0;i<=word1.length();i++){
         Arrays.fill(dp[i],-1);
     }
     return f(0,0,word1,word2,dp);   
    }
    public int f(int i,int j,String word1,String word2,int[][] dp){
        if(i==word1.length() && j==word2.length()) return 0;
        if( dp[i][j]!=-1) return dp[i][j];
        int same=5001;
        if(i<word1.length() && j<word2.length() && word1.charAt(i)==word2.charAt(j)){
            same=f(i+1,j+1,word1,word2,dp);
        }
        int insert=5001;
        if(j<word2.length()){
            insert=1+f(i,j+1,word1,word2,dp);
        }
        int delete=5001;
        if(i<word1.length()){
            delete=1+f(i+1,j,word1,word2,dp);
        }
        int replace=5000;
        if(i<word1.length() && j<word2.length()){
            replace=1+f(i+1,j+1,word1,word2,dp);
        }
        return dp[i][j]=Math.min(same,Math.min(insert,Math.min(delete,replace)));
    }
}