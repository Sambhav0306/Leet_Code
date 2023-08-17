class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j]=mat[i][j];
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(dp[i][j]==0){
                    continue;
                }

                int minSteps = m*n;
                if(i>0){
                    minSteps = Math.min(minSteps,dp[i-1][j]);
                }

                if(j>0){
                    minSteps = Math.min(minSteps,dp[i][j-1]);
                }

                dp[i][j]=minSteps+1;
            }
        }

        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(dp[i][j]==0){
                    continue;
                }

                int minSteps = m*n;

                if(i<m-1){
                    minSteps = Math.min(minSteps,dp[i+1][j]);
                }
                if(j<n-1){
                    minSteps = Math.min(minSteps,dp[i][j+1]);
                }

                dp[i][j]=Math.min(dp[i][j],minSteps+1);
            }
        }
        return dp;
    }
}