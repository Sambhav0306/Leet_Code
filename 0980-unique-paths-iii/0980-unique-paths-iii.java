class Solution {
    int count=0;
    public int uniquePathsIII(int[][] grid) {
        // int[][][] dp=new int[grid.length][grid[0].length][grid/le];
         int si=0;
        int sj=0;
        int ei=0;
        int ej=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                    si=i;
                    sj=j;
                }
                if(grid[i][j]==2){
                    ei=i;
                    ej=j;
                }
                if(grid[i][j]==-1){
                    count++;
                }
            }
        }
        return f(si,sj,ei,ej,grid,0);
    }
    public int f(int i,int j,int e1,int e2,int[][] grid,int steps){
        if(i==e1&& j==e2) {
            if(steps==grid.length*grid[0].length-count-1) return 1;
            return 0;
        }
        if(i>=grid.length || j>=grid[0].length|| i<0 || j<0 || grid[i][j]==-1) return 0;
        grid[i][j]=-1;
        int up=0;
        int down=0;
        int left=0;
        int right=0;
        if(i-1>=0&& grid[i-1][j]!=-1) up=f(i-1,j,e1,e2,grid,steps+1);
        if(i+1<grid.length&& grid[i+1][j]!=-1) down=f(i+1,j,e1,e2,grid,steps+1);
        if(j-1>=0 && grid[i][j-1]!=-1) left=f(i,j-1,e1,e2,grid,steps+1);
        if(j+1<grid[0].length&& grid[i][j+1]!=-1) right=f(i,j+1,e1,e2,grid,steps+1);
        grid[i][j]=0;
        return up+down+left+right;
    }
}