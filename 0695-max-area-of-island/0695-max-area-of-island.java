class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0||grid[i][j]==-1) continue;
                max=Math.max(max,1+f(i,j,grid));
            }
        }
        return max;
    }
    public int f(int i,int j,int[][] grid){
        int up=0;
        int down=0;
        int right=0;
        int left=0;
        grid[i][j]=-1;
        if(i-1>=0 && grid[i-1][j]==1){
            up=1+f(i-1,j,grid);
        }
        if(i+1< grid.length && grid[i+1][j]==1){
            down=1+f(i+1,j,grid);
        }
        if(j+1<grid[0].length && grid[i][j+1]==1){
            right=1+f(i,j+1,grid);
        }
        if(j-1>=0 && grid[i][j-1]==1){
            left=1+f(i,j-1,grid);
        }
        return up+down+left+right;
    }
}