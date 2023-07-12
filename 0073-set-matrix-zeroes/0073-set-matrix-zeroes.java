class Solution {
    public void setZeroes(int[][] matrix) {
        int c=matrix.length;
        int r=matrix[0].length;
        HashSet<Integer> col=new HashSet<>();
        HashSet<Integer> row=new HashSet<>();
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                if(matrix[i][j]==0){
                        col.add(i);
                        row.add(j);
                }
            }
        }
        while(col.size()!=0){
            int a=Collections.max(col);
            for(int i=0;i<r;i++){
                matrix[a][i]=0;
            }
            col.remove(a);
        }
        while(row.size()!=0){
            int a=Collections.max(row);
            for(int i=0;i<c;i++){
                matrix[i][a]=0;
            }
            row.remove(a);
        }
    }
}