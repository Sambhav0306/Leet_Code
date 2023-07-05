class Solution {
 public int longestSubarray(int[] nums) {
     int start = 0;
     int zero = 0;
     int longestOnes =0;
     for(int i=0;i<nums.length;i++){
         if(nums[i]==0)
         zero++;
         while(zero>1){
             if(nums[start]==0)
             zero--;
             start++;
         }
         longestOnes = Math.max(longestOnes,i-start);
     }
     return longestOnes;
 }
}