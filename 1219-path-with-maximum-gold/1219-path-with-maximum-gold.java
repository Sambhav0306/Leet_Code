class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                max=Math.max(max,f(i,j,grid));
            }
        }
        return max;
    }
    public int f(int i,int j,int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 ||j<0 || i>=n || j>=m ) return 0;
        if(grid[i][j]==0) return 0;
        int a=grid[i][j];
        grid[i][j]=0;
        int up=0;
        int down=0;
        int left=0;
        int right=0;
        if(i-1>=0) up=f(i-1,j,grid);
        if(i+1<n) down=f(i+1,j,grid);
        if(j-1>=0) left=f(i,j-1,grid);
        if(j+1<m) right=f(i,j+1,grid);
        grid[i][j]=a;
        return grid[i][j]+ Math.max(up,Math.max(down,Math.max(left,right)));
    }
}