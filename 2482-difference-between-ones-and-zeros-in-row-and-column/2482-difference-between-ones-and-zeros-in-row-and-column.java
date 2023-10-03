class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] ones=new int[grid.length][grid[0].length];
        int[][] zeros=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            int one=0;
            int zero=0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) zero++;
                else one++;
            }
            for(int j=0;j<grid[0].length;j++){
                ones[i][j]=one;
                zeros[i][j]=zero;
            }
        }
        for(int i=0;i<grid[0].length;i++){
            int one=0;
            int zero=0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==0) zero++;
                else one++;
            }
            for(int j=0;j<grid.length;j++){
                ones[j][i]+=one;
                zeros[j][i]+=zero;
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=ones[i][j]-zeros[i][j];
            }
        }
        return grid;
    }
}