class Solution {
    public  int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(k!=0){
            if(nums[i]<0){
                nums[i]=-nums[i];
                if(i+1<nums.length && nums[i]>nums[i+1]){
                    i++;
                }
                k--;
            }else if(nums[i]==0){
                break;
            }else if(nums[i]>0){
                nums[i]=-nums[i];
                k--;
            }
        }
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }
        return sum;
    }
}