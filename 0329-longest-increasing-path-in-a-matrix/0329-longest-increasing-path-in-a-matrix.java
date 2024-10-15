class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int max=-2882383;
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(dp[i][j]!=-1) max=Math.max(dp[i][j],max);
                else max=Math.max(f(i,j,matrix,dp),max);
            }
        }
        return max+1;
    }
    public int f(int i,int j,int[][] mat,int[][] dp){
        if(i>=mat.length || i<0 || j>=mat[0].length || j<0 || mat[i][j]==-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int k=mat[i][j];
        mat[i][j]=-1;
        int up=0;
        int down=0;
        int left=0;
        int right=0;
        if(i-1>=0 && mat[i-1][j]>k) up=1+f(i-1,j,mat,dp);
        if(j-1>=0 && mat[i][j-1]>k) left=1+f(i,j-1,mat,dp);
        if(i+1<mat.length && mat[i+1][j]>k) down=1+f(i+1,j,mat,dp);
        if(j+1<mat[0].length && mat[i][j+1]>k) right=1+f(i,j+1,mat,dp);
        mat[i][j]=k;
        return dp[i][j]=Math.max(up,Math.max(down,Math.max(left,right)));
    }
}