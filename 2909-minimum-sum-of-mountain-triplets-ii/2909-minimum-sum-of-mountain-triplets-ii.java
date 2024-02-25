class Solution {
    public int minimumSum(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        // int m1=Math.max();
        int m2=Integer.MAX_VALUE;
        int m1=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            left[i]=Math.min(nums[i-1],m1);
            m1=left[i];
            right[nums.length-i-1]=Math.min(nums[nums.length-i],m2);
            m2=right[nums.length-i-1];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>left[i] && nums[i]>right[i]) ans=Math.min(nums[i]+left[i]+right[i],ans);
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}