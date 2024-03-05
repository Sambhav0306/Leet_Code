class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            int k=nums[i+1]-nums[i];
            int count=2;
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[j+1]-nums[j]==k){
                    count++;
                    if(count>=3) ans++;
                }else break;
            }
        }
        return ans;
    }
}