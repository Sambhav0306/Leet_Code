class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] mat=new int[nums.length/3][3];
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length;i=i+3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
            mat[j][0]=nums[i];
            mat[j][1]=nums[i+1];
            mat[j][2]=nums[i+2];
            j++;
        }
        return mat;
    }
}