class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        if(arr[0][0]==1){
            return 0;
        }
        return f(arr,m-1,n-1,dp);
    }
    public int f(int[][] arr,int i,int j,int[][] dp){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0 || arr[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int up=f(arr,i-1,j,dp);
        int right=f(arr,i,j-1,dp);
        return dp[i][j]=up+right;
    }
}