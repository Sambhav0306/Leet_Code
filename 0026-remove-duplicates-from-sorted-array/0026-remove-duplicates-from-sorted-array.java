class Solution {
    public int removeDuplicates(int[] nums) {
       // Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
           // for(int j=i+1;j<nums.length;j++){
               // if(nums[i]==101|| nums[i]!=nums[j]){
               //     break;
               // }
               if(nums[i]==nums[i+1]){
                   nums[i]=101;
               }
           }
       // }  
       Arrays.sort(nums);
       int count=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==101){
               break;
           }
           count++;
       }
       return count++;
    }
}