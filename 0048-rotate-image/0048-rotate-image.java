class Solution {
    public void rotate(int[][] matrix) {
        // int r=matrix.length-1;
        // int c=matrix.length-1;
        // // int i=0;
        // int[][] arr=new int[r+1][r+1];
        // for(int i=0;i<=r;i++)
        // {
        //     int k=c;
        //     for(int j=0;j<=r;j++)
        //     {
        //          arr[i][j]=matrix[k][i];
        //          k--;
        //     }
        // }
        // for(int i=0;i<=r;i++)
        // {
        //     for(int j=0;j<=r;j++)
        //     {
        //          matrix[i][j]=arr[i][j];
        //     }
        // }
        int i=0;
        int n=matrix.length;
        while(i<n/2){
            int j=i;
//            int a=0;
            int temp=0;
//            int b=0;
            while(j<n-i-1){
                temp=matrix[j][i];
                matrix[j][i]=matrix[n-1-i][j];
                matrix[n-1-i][j]=temp;
//                reverse(matrix[j][i],matrix[n-1-i][j]);
                temp=matrix[n-1-i][j];
                matrix[n-1-i][j]=matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i]=temp;
                temp=matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
//                reverse(matrix[n-1-i][j],matrix[n-1-j][n-1-i]);
//                reverse(matrix[n-1-j][n-1-i],matrix[i][n-1-j]);
                j++;
            }
            i++;
        }
    }
    // public void reverse(int i,int j){
    //     int temp=i;
    //     i=j;
    //     j=temp;
    // }
}