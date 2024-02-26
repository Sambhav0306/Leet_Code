class Solution {
    public int sumOfBeauties(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            left[i]=Math.max(nums[i-1],m1);
            m1=left[i];
            right[nums.length-i-1]=Math.min(nums[nums.length-i],m2);
            m2=right[nums.length-i-1];
        }
        int ans=0;
        for(int i=1;i<nums.length-1;i++){
            if(left[i]<nums[i] && nums[i]<right[i]) ans+=2;
            else if(nums[i-1]<nums[i] && nums[i]<nums[i+1]) ans++;
        }
        return ans;
    }
}