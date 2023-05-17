class Solution {
    public void gameOfLife(int[][] boards) {
        int n=boards.length;
        int m=boards[0].length;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ans(i,j,boards);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boards[i][j]=arr[i][j];
            }
        }
    }
    public int ans(int i,int j, int[][] boards){
        int n=boards.length;
        int m=boards[0].length;
        int count=0;
        if(i-1>=0 && boards[i-1][j]==1){
            count++;
        }
        if(j+1<m && boards[i][j+1]==1){
            count++;
        }
        if(i+1<n && boards[i+1][j]==1){
            count++;
        }
        if(j-1>=0 && boards[i][j-1]==1){
            count++;
        }
        if(i+1<n && j+1<m && boards[i+1][j+1]==1){
            count++;
        }
        if(i+1<n && j-1>=0 && boards[i+1][j-1]==1){
            count++;
        }
        if(i-1>=0 && j+1<m && boards[i-1][j+1]==1){
            count++;
        }
        if(i-1>=0 && j-1>=0 && boards[i-1][j-1]==1){
            count++;
        }
        if(boards[i][j]==0 && count==3){
            return 1;
        }
        if(boards[i][j]==1 && (count==2 || count==3)){
            return 1;
        }
        return 0;
    }
}