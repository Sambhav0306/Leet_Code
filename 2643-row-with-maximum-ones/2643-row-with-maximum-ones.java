class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int mc=0;
        int r=0;
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) c++;
            }
            if(c>mc){
            mc=c;
            r=i;
            }
        }
        
        int[] arr={r,mc};
        return arr;
    }
}