class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int[][][] dp=new int[s1.length()+1][s2.length()+1][s3.length()+1];
        for(int i=0;i<s1.length()+1;i++){
            for(int j=0;j<s2.length()+1;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return f(0,0,0,s1,s2,s3,dp);
    }
    public boolean f(int i,int j,int k, String s1,String s2,String s3,int[][][] dp){
        if(i==s1.length() && j==s2.length()){
            if(k==s3.length()) return true;
            return false;
        }
        if(dp[i][j][k]!=-1){
            if(dp[i][j][k]==0) return false;
            return true;
        }
        boolean first=false;
        boolean second=false;
        if(i<s1.length() &&  k<s3.length() && s1.charAt(i)==s3.charAt(k) ){
            first=f(i+1,j,k+1,s1,s2,s3,dp);
        }
        if(j<s2.length() && k<s3.length() && s2.charAt(j)==s3.charAt(k)){
            second=f(i,j+1,k+1,s1,s2,s3,dp);
        }
        boolean ans= first|second;
        if(ans){
            dp[i][j][k]=1;
        }else{
            dp[i][j][k]=0;
        }
        return ans;
    }
}