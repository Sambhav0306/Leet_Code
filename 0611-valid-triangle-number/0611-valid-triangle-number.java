class Solution {
    public int triangleNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[k]<nums[i]+nums[j]) ans++;
                    else break;
                }
            }
        }
        return ans;
    }
}