class Solution {
    public  int countServers(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int a=f(i,j,grid);
                    if(a>1) ans+=a;
                }
            }
        }
        return ans;
    }
    public int f(int i,int j,int[][] mat){
        if(i<0 ||i>=mat.length || j<0 || j>=mat[0].length) return 0;
        mat[i][j]=-1;
        int row=0;
        int col=0;
        for(int i1=0;i1<mat.length;i1++){
            if(mat[i1][j]==1) row+=f(i1,j,mat);
        }
        for(int j1=0;j1<mat[0].length;j1++){
            if(mat[i][j1]==1) col+=f(i,j1,mat);
        }
        return 1+row+col;
    }
}