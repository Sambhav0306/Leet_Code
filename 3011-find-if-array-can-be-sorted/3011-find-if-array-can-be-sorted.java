class Solution {
    public boolean canSortArray(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(i-1>=0 && nums[i]<nums[i-1]){
                int j=i;
                while(true){
                    if(j==0 || nums[j-1]<=nums[j]) break;
                    else{
                        int a=Integer.bitCount(nums[j-1]);
                        int b=Integer.bitCount(nums[j]);
                        if(a!=b) return false;
                        int temp=nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=temp;
                        j--;
                    }
                }
            }
            i++;
        }
        return true;
    }
}