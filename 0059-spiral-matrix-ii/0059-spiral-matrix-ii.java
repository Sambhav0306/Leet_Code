class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        for (int[] row : arr)
            Arrays.fill(row, 0);
        int a=(int)Math.pow(n,2);
        int k=1;
        int i=0;
        int j=0;
        int counter=0;
        while(k<=a){
            if(counter%2==0){
                int count=0;
                int o=j;
                while(count<n-o && arr[i][j]==0){
                    arr[i][j]=k;
                    j++;
                    k++;
                    count++;
                }
                i++;
                j--;
                o=i;
                count=0;
                while(count<n-o && arr[i][j]==0){
                    arr[i][j]=k;
                    i++;
                    k++;
                    count++;
                }
                i--;
                j--;
                counter++;
            }else{
                int count=n;
                int o=j;
                while(count>=n-o && arr[i][j]==0){
                    arr[i][j]=k;
                    j--;
                    k++;
                    count--;
                }
                j++;
                i--;
                count=n;
                while(count>=n-o && arr[i][j]==0){
                    arr[i][j]=k;
                    i--;
                    k++;
                    count--;
                }
                i++;
                j++;
                counter++;
            }
        }
        return arr;
    }
}
