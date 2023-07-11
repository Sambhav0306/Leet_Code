class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;        
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    dp[0][0]=grid[0][0];
                    continue;
                }
                int up=grid[i][j];
                int left=grid[i][j];
                if(i>0){
                    up+=dp[i-1][j];
                }else{
                    up+=(int)Math.pow(10,9);
                }
                if(j>0){
                    left+=dp[i][j-1];
                }else{
                    left+=(int)Math.pow(10,9);
                }
                dp[i][j]=Math.min(up,left);
            }
        }
        return dp[n-1][m-1];
        // return f(grid,n-1,m-1,dp);
    }
    // public int f(int[][] grid,int i, int j,int[][] dp){
    //     if(i==0 && j==0){
    //         return grid[0][0];
    //     }
    //     if(i<0 || j<0){
    //         return (int)Math.pow(10,9);
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     int up=grid[i][j]+f(grid,i-1,j,dp);
    //     int left=grid[i][j]+f(grid,i,j-1,dp);
    //     return dp[i][j]=Math.min(up,left);
    // }
}