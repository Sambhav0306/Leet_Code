class Solution {
    public int findDuplicate(int[] nums) {
     // Arrays.sort(nums);
     // for(int i=0;i<nums.length;i++){
     //     if(nums[i]==nums[i+1]){
     //         return nums[i];
     //     }
     // }   
        int i=0;
        while(i<nums.length){
            int n=nums[i]-1;
            if(nums[i]!=nums[n]){
                swap(nums,n,i);
            }else{
                i++;
            }
        }
     return nums[nums.length-1];
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}