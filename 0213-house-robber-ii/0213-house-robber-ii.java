class Solution {
   public int rob(int[] nums) {
       int[] dp1=new int[nums.length];
       int[] dp2=new int[nums.length];
      Arrays.fill(dp1,-1);
      Arrays.fill(dp2,-1);
      int a1= nums[0]+f1(nums,2,dp1);
      int a2=f2(nums,1,dp2); 
      return Math.max(a1,a2);
    }
    public int f1(int[] nums,int i,int[] dp){
        if(i>=nums.length-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int not_take=f1(nums,i+1,dp);
        int take=nums[i]+f1(nums,i+2,dp);
        return dp[i]=Math.max(take,not_take);
    }
    public int f2(int[] nums,int i,int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int not_take=f2(nums,i+1,dp);
        int take=nums[i]+f2(nums,i+2,dp);
        return dp[i]=Math.max(take,not_take);
    }
}