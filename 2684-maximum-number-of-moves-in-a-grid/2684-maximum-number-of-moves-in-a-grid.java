class Solution {
    public int maxMoves(int[][] grid) {
        int max=0;
        int[][] dp=new int[grid.length][grid[0].length];
            for(int j=0;j<grid.length;j++){
                Arrays.fill(dp[j],-1);
            }
        for(int i=0;i<grid.length;i++){
            max=Math.max(max,f(i,0,grid,dp));
        }
        return max;
    } 
    public int f(int i,int j,int[][] nums,int[][] dp){
        if(j==nums[0].length-1){
            return 0;
        }
        int up=0;
        int str=0;
        int down=0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i-1>=0 && nums[i][j]<nums[i-1][j+1]){
            up=1+f(i-1,j+1,nums,dp);
        }
        if(nums[i][j]<nums[i][j+1]){
            str=1+f(i,j+1,nums,dp);
        }
        if(i+1<nums.length && nums[i][j]<nums[i+1][j+1]){
            down=1+f(i+1,j+1,nums,dp);
        }
        return dp[i][j]=Math.max(up,Math.max(str,down));
    }
}