class Solution {
    public int rob(int[] nums) {
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int tp=nums[i];
            if(i>1){
                tp+=prev2;
            }
            int not_tp=prev;
            int curi=Math.max(tp,not_tp);
            prev2=prev;
            prev=curi;
        }
        return prev;
    }
    // public int f(int[] nums,int ind,int[] dp){
    //     if(ind==0){
    //         return nums[0];
    //     }
    //     if(ind<0){
    //         return 0;
    //     }
    //     if(dp[ind]!=-1){
    //         return dp[ind];
    //     }
    //     int tp=nums[ind]+f(nums,ind-2,dp);
    //     int not_tp=0+f(nums,ind-1,dp);
    //     return dp[ind]=Math.max(tp,not_tp);
    // }
}