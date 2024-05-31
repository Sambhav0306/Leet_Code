class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr=new int[2];
        if(nums.length==2){
            arr[0]=nums[0];
            arr[1]=nums[1];
            return arr;
        }
        int j=0;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                arr[j]=nums[i];
                j++;
                count++;
            }else{
                i++;
            }
            if(i==nums.length-2 && count==1){
                arr[j]=nums[nums.length-1];
            }
        }
        return arr;
    }
}