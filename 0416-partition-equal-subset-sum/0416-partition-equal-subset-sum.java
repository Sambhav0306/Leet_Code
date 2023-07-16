class Solution {
    public boolean canPartition(int[] nums) {
     int sum=0;
     int n=nums.length;
        if(n==1){
            return false;
        }
     for(int i=0;i<n;i++){
         sum+=nums[i];
     }
     boolean[][] dp=new boolean[n][sum/2+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],false);
        }
     if(sum%2==1){
         return false;
     }   
      for(int i=0;i<n;i++){
          dp[i][0]=true;
      }
        if(nums[0]<=sum/2){
            dp[0][nums[0]]=true;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=sum/2;j++){
                boolean not_take=dp[i-1][j];
                boolean take=false;
                if(nums[i]<=j){
                    take=dp[i-1][j-nums[i]];
                }
                dp[i][j]=take|not_take;
            }
        }
        return dp[n-1][sum/2];
    }
    // public boolean subset(int[] nums,int n,int ind,int k,int[][] dp){
    //     if(k==0){
    //         return true;
    //     }
    //     if(ind==0){
    //         if(k==nums[0]){
    //             return true;
    //         }
    //         return false;
    //     }
    //     if(dp[ind][k]!=-1){
    //         if(dp[ind][k]==1){
    //             return true;
    //         }else{
    //             return false;
    //         }
    //     }
    //     boolean not_take=subset(nums,n,ind-1,k,dp);
    //     boolean take=false;
    //     if(nums[ind]<=k){
    //         take=subset(nums,n,ind-1,k-nums[ind],dp);
    //     }
    //     boolean ans= take|not_take;
    //     if(ans){
    //         dp[ind][k]=1;
    //     }else{
    //         dp[ind][k]=0;
    //     }
    //     return ans;
    // }
}