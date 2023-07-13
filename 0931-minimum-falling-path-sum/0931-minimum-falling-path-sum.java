class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int min=100000;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],101);
        }
        for(int j=0;j<matrix[0].length;j++){
            min=Math.min(min,f(n-1,j,matrix,dp));
        }
        return min;
    }
    public int f(int i,int j,int[][] matrix,int[][] dp){
        if(j<0 || j>=matrix[0].length){
            return 1000000;
        }
        if(i==0){
            return matrix[i][j];
        }
        if(dp[i][j]!=101){
            return dp[i][j];
        }
        int u=matrix[i][j]+f(i-1,j,matrix,dp);
        int ul=matrix[i][j]+f(i-1,j-1,matrix,dp);
        int ur=matrix[i][j]+f(i-1,j+1,matrix,dp);
        return dp[i][j]=Math.min(u,Math.min(ul,ur));
    }
}