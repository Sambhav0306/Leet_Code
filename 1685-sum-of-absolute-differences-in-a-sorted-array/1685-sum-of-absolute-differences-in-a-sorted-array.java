class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] results=new int[nums.length];
        int pre=0;
        int suf=0;
        for(int i=0;i<nums.length;i++){
            suf+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            results[i]=Math.abs(suf-nums[i]*(nums.length-i))+Math.abs(pre-nums[i]*i);
            pre+=nums[i];
            suf-=nums[i];
        }
        return results;
    }
}