class Solution {
    public int[] findArray(int[] pref) {
       int[] nums=new int[pref.length];
        nums[0]=pref[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i+1]=pref[i]^pref[i+1];
        }
        return nums;
    }
}