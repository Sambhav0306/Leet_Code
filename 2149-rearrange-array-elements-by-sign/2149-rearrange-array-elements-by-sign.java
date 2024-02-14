class Solution {
   public int[] rearrangeArray(int[] nums) {
    int e= 0;
    int o = 1 ; 
    int n = nums.length;
    int [] ans = new int [n];
    
   for(int elem :nums){
       if(elem >=0){
           ans[e]=elem;
           e+=2;
       }else{
           ans[o]=elem;
           o+=2;
       }
   }
    return ans;
}
}