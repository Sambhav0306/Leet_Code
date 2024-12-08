class Solution {
    public long numberOfWeeks(int[] nums) {
        long ans=0;
        Arrays.sort(nums);
        long sum=0;
        for(int i:nums){
            sum+=i;
        }
        sum-=nums[nums.length-1];
        if(sum>=nums[nums.length-1]){
            ans=(sum+nums[nums.length-1]);
        }else ans=2*sum+1;
        return ans;
    }
}