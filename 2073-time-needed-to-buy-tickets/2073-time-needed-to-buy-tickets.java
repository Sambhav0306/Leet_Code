class Solution {
    public int timeRequiredToBuy(int[] nums, int k) {
     int a=nums[k];
        int count=0;
        for(int i=0;i<=k;i++){
            if(nums[i]>=a) count+=a;
            else count+=nums[i];
        }
        for(int i=k+1;i<nums.length;i++){
            if(nums[i]>=a) count+=a-1;
            else count+=nums[i];
        }
        return count;
    }
}