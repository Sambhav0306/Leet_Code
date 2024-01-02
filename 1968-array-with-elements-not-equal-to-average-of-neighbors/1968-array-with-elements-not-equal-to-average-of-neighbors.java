class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            i++;
            if(i+1<nums.length){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        // if(nums.length%2==0){
        //     int temp=nums[nums.length-1];
        //     nums[nums.length-1]=nums[nums.length-2];
        //     nums[nums.length-2]=temp;
        // }
        return nums;
    }
}