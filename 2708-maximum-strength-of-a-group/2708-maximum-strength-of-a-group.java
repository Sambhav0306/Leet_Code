class Solution {
    public long maxStrength(int[] nums) {

        long ans=1;
        int count=0;
        int j=0;
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        if(nums.length>1 && nums[0]<0 && nums[1]==0 && nums[nums.length-1]==0) return 0;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i]<0 && nums[i+1]>=0) j=i;
            if(nums[i]!=0){
                count++;
                ans*=nums[i];
            }
        }
        if(nums[nums.length-1]<0) j=nums.length-1;
        if(count==0) return 0;
        if(ans<0) ans/=nums[j];
        return ans;
        
    }
}