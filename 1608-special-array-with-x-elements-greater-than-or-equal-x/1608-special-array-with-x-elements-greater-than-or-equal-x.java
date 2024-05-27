class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(i<=nums[n-i] && i-1>=0 && i>nums[n-i-1] ) return i;
        }
        if(nums[0]>=n) return n;
        return -1;
    }
}