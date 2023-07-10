class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        if(arr[0][0]==1){
            return 0;
        }
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 &&j==0){
                    dp[0][0]=1;
                    continue;
                }
                if(arr[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                int up=0;
                int right=0;
                if(i>0){
                    up=dp[i-1][j];
                }
                if(j>0){
                    right=dp[i][j-1];
                }
                dp[i][j]=up+right;
            }
        }
        return dp[m-1][n-1];
    }
    // public int f(int[][] arr,int i,int j,int[][] dp){
    //     if(i==0 && j==0){
    //         return 1;
    //     }
    //     if(i<0 || j<0 || arr[i][j]==1){
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     int up=f(arr,i-1,j,dp);
    //     int right=f(arr,i,j-1,dp);
    //     return dp[i][j]=up+right;
    // }
}