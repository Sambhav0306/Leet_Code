class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    public boolean canCross(int[] nums) {
    int[][] dp=new int[nums.length+1][2000];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            Arrays.fill(dp[i],-1);
        }
        return f(0,nums,1,dp);
    }
    public boolean f(int i,int[] nums,int k,int[][] dp){
        if(k<1){
            return false;
        }
        if(i==nums.length-1){
            return true;
        }
        if(!map.containsKey(nums[i]+k)){
            return false;
        }
        if(dp[i][k]!=-1){
            if(dp[i][k]==1){
                return true;
            }
            return false;
        }
        boolean ans=f(map.get(nums[i]+k),nums,k,dp)||f(map.get(nums[i]+k),nums,k-1,dp)||f(map.get(nums[i]+k),nums,k+1,dp);
        if(ans){
            dp[i][k]=1;
        }else{
            dp[i][k]=0;
        }
        return ans;
    }
}