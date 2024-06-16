class Solution {
    public int minPatches(int[] nums, int n) {
        long seq=0; 
        int i=0;
        int patch=0;  

        while(seq<n && i<nums.length){ 
            if(nums[i]<=seq+1){ 
                seq+=nums[i];
                i++;
            }
            else{
                patch++;
                seq+=seq+1;
            }
        }

            while(seq<n){
                patch++;
                 seq+=seq+1;
        }
        return patch;
    }
}