class Solution {
    public boolean increasingTriplet(int[] nums) {
       int first=Integer.MAX_VALUE;
       int second =first;
        for(int i=0;i<nums.length;i++){

           int third =nums[i];

            if(third<=first){
                first=third;
            }else if(third<=second){
                second=third;
            }else{
                return true;
            }
        }
        return false;
    }
}