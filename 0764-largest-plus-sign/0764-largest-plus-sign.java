class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] mat=new int[n][n];
        int max=0;
        for(int i=0;i<n;i++){
            Arrays.fill(mat[i],1);
        }
        for(int i=0;i<mines.length;i++){
            mat[mines[i][0]][mines[i][1]]=0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1) max=Math.max(max,1+f(i,j,1,mat,n));
            }
        }
        return max;
    }
    public int f(int i,int j,int add,int[][] mat,int n){
        int plus=0;
        if(i+add<n && j+add<n && i-add>=0 && j-add>=0 && mat[i+add][j]==1 && mat[i-add][j]==1 && mat[i][j+add]==1 && mat[i][j-add]==1  ) plus=1+f(i,j,add+1,mat,n);
        return plus;
    }
}