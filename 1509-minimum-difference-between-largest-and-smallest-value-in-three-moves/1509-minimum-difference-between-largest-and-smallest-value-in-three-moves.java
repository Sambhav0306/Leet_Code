class Solution {
    public int minDifference(int[] nums) {
       Arrays.sort(nums);
        if(nums.length<=4) return 0;
        else{
            int min=nums[nums.length-1]-nums[0];
            min=Math.min(nums[nums.length-2]-nums[0],min);
            min=Math.min(nums[nums.length-3]-nums[0],min);
            min=Math.min(nums[nums.length-4]-nums[0],min);
            min=Math.min(nums[nums.length-1]-nums[1],min);
            min=Math.min(nums[nums.length-2]-nums[1],min);
            min=Math.min(nums[nums.length-3]-nums[1],min);
            min=Math.min(nums[nums.length-2]-nums[2],min);
            min=Math.min(nums[nums.length-1]-nums[2],min);
            min=Math.min(nums[nums.length-1]-nums[3],min);
            return min;
        }
    }
}