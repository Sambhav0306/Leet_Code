class Solution {
    public int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[i][0]==0){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
        }
        for(int j=0;j<m;j++){
            int a=0;
            int b=0;
            for(int i=0;i<n;i++){
                if(grid[i][j]==0) a++;
                else b++;
            }
            if(b<a){
                for(int i=0;i<n;i++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int add=0;
            for(int j=m-1;j>=0;j--){
                add+=grid[i][j]*(int)(Math.pow(2,m-j-1));
            }
            ans+=add;
        }
        return ans;
    }
}