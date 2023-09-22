class Solution {
    int num=(int)1e9+7;
    public int countPaths(int[][] grid) {
        long sum=0;
        long [][] dp=new long[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum=(sum+1+f(i,j,grid,dp))%num;
            }
        }
        return (int)sum%num;
    }
    public long f(int i,int j,int[][] grid,long[][] dp){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j]%num;
        long up=0;
        long down=0;
        long left=0;
        long right=0;
        if(i-1>=0 && grid[i][j]<grid[i-1][j]){
            up=(1+f(i-1,j,grid,dp))%num;
        }
        if(i+1<grid.length && grid[i][j]<grid[i+1][j]){
            down=(1+f(i+1,j,grid,dp))%num;
        }
        if(j-1>=0 && grid[i][j]<grid[i][j-1]){
            left=(1+f(i,j-1,grid,dp))%num;
        }
        if(j+1<grid[0].length && grid[i][j]<grid[i][j+1]){
            right=(1+f(i,j+1,grid,dp))%num;
        }
        return dp[i][j]=(up+down+left+right);
    }
}