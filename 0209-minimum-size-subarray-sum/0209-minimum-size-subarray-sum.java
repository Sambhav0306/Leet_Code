class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(i<nums.length && j<nums.length){
            sum+=nums[j];
            if(sum>=target){
                while(i<nums.length && sum>=target){
                    sum-=nums[i];
                    min=Math.min(min,j-i+1);
                    i++;
                }
            }
            
            j++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}