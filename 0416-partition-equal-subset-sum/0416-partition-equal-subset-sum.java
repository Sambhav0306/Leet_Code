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
     int[][] dp=new int[n][sum/2+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
     if(sum%2==1){
         return false;
     }   
        return subset(nums,n,n-1,sum/2,dp);
    }
    public boolean subset(int[] nums,int n,int ind,int k,int[][] dp){
        if(k==0){
            return true;
        }
        if(ind==0){
            if(k==nums[0]){
                return true;
            }
            return false;
        }
        if(dp[ind][k]!=-1){
            if(dp[ind][k]==1){
                return true;
            }else{
                return false;
            }
        }
        boolean not_take=subset(nums,n,ind-1,k,dp);
        boolean take=false;
        if(nums[ind]<=k){
            take=subset(nums,n,ind-1,k-nums[ind],dp);
        }
        boolean ans= take|not_take;
        if(ans){
            dp[ind][k]=1;
        }else{
            dp[ind][k]=0;
        }
        return ans;
    }
}