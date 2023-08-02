class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count++;
        //     }
        // }
        // if(count>0){
        //     return f(nums,target,nums.length-1)+(int)Math.pow(2,count-1);
        // }
        return f(nums,target,nums.length-1);
    }
    public int f(int[] nums,int target,int ind){
        if(ind==0){
            if(nums[0]==0 && target==0){
                return 2;
            }
            if(nums[0]==target || nums[0]==-target){
               return 1;
            }
            return 0;
        }
        int pos=f(nums,target-nums[ind],ind-1);
        int neg=f(nums,target+nums[ind],ind-1);
        return pos+neg;
    }
}