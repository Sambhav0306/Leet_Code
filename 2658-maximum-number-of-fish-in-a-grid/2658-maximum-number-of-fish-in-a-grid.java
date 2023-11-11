class Solution {
    public int findMaxFish(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) continue;
                max=Math.max(max,f(i,j,grid));
            }
        }
        return max;
    }
    public int f(int i,int j,int[][] grid){
        if(grid[i][j]==0) return 0;
        int a=grid[i][j];
        grid[i][j]=0;
        int up=0;
        int down=0;
        int right=0;
        int left=0;
        if(i-1>=0 && grid[i-1][j]!=0){
            up+=f(i-1,j,grid);
        }  
        if(j-1>=0 && grid[i][j-1]!=0){
            down+=f(i,j-1,grid);
        }
        if(i+1<grid.length && grid[i+1][j]!=0){
            right+=f(i+1,j,grid);
        }
        if(j+1<grid[0].length && grid[i][j+1]!=0){
            left+=f(i,j+1,grid);
        }
        // grid[i][j]=a;
        return a+left+right+up+down;
    }
}