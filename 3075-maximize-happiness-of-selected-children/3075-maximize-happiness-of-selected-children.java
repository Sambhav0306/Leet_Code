class Solution {
    public long maximumHappinessSum(int[] nums, int k) {
      Arrays.sort(nums);
      long ans=0;
      int a=0;
        int i=nums.length-1;
        while(a!=k){
            if(nums[i]-a<=0) break;
            ans+=nums[i]-a;
            i--;
            a++;
        }
        return ans;
    }
}