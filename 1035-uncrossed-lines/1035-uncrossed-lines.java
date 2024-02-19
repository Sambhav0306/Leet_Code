class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
      int[][] dp=new int[nums1.length][nums2.length];
      for(int i=0;i<nums1.length;i++){
          Arrays.fill(dp[i],-1);
      }
      return f(0,0,nums1,nums2,dp);  
    }
    public int f(int i,int j,int[] nums1,int[] nums2,int[][] dp){
        if(i==nums1.length || j==nums2.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int not_take=f(i+1,j,nums1,nums2,dp);
        int take=0;
        for(int k=j;k<nums2.length;k++){
            if(nums1[i]==nums2[k]){
                take=1+f(i+1,k+1,nums1,nums2,dp);
                break;
            }
        }
        return dp[i][j]=Math.max(take,not_take);
    }
}