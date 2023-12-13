class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(f1(i,j,mat)==true && f2(j,i,mat)==true){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public  boolean f1(int i,int k,int[][] mat){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1 && j!=k) return false;
        }
        return true;
    }
    public  boolean f2(int i,int k,int[][] mat){
        for(int j=0;j<mat.length;j++){
            if(mat[j][i]==1&& j!=k) return false;
        }
        return true;
    }
}