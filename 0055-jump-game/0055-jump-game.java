class Solution {
    
    public boolean canJump(int[] nums) {
       int i =nums.length-2;
        int goal = nums.length-1;
        while(i>=0){
            if(i+nums[i] >= goal){
                goal = i;
            }
            i--;
        }
        if( goal ==0){
            return true;
        }
        return false;
    }
}