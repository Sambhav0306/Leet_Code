class Solution {
    int ans[][];
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int mat[][]=new int[m][n];
        ans=new int[m][n];
        for(int i=0;i<guards.length;i++){
            mat[guards[i][0]][guards[i][1]]=1;
            ans[guards[i][0]][guards[i][1]]=1;
        }
        for(int i=0;i<walls.length;i++){
            mat[walls[i][0]][walls[i][1]]=-1;
            ans[walls[i][0]][walls[i][1]]=-1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    dfs(i,j,m,n,mat);
                }
            }
        }
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j]==0)res++;
            }
        }
        return res;
    }
    public void dfs(int r,int c,int m,int n,int mat[][]){
        int r1=r+1;
        int r2=r-1;
        int c1=c+1;
        int c2=c-1;
        while(c1<n){
            if(mat[r][c1]==1)break;
            else if(mat[r][c1]==-1)break;
            ans[r][c1]=1;
            c1++;
        }
        while(c2>=0){
            if(mat[r][c2]==1)break;
            else if(mat[r][c2]==-1)break;
            ans[r][c2]=1;
            c2--;
        }
        while(r1<m){
            if(mat[r1][c]==1)break;
            else if(mat[r1][c]==-1)break;
            ans[r1][c]=1;
            r1++;
        }
        while(r2>=0){
            if(mat[r2][c]==1)break;
            else if(mat[r2][c]==-1)break;
            ans[r2][c]=1;
            r2--;
        }
    }
}