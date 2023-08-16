class Solution {
    int o=1;
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int max=1;
        for(int i=1;i<nums.length;i++){
            o=i;
           max=Math.max(max,f(nums,nums.length-i,nums.length-i,dp));
        }
        return max;
    }
    public int f(int[] nums,int ind,int a,int[][] dp){
        if(ind==-1){
            return 0;
        }
        if(dp[ind][a]!=-1){
            return dp[ind][a];
        }
        int not_take=f(nums,ind-1,a,dp);
        int take=0;
        if(nums[ind]<nums[a]|| ind==nums.length-o){
            take=1+f(nums,ind-1,ind,dp);
        }
        return dp[ind][a]=Math.max(take,not_take);
    }
}