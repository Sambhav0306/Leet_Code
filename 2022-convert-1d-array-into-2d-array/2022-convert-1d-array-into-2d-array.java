class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr=new int[m][n];
        if(m*n!=original.length){
            return new int[][]{};
        }
        int r=0;
        int c=0;
        for(int i=0;i<original.length;i++){
            arr[r][c]=original[i];
            c++;
            if(c==n){
                r++;
                c=0;
            }
        }
        return arr;
    }
}