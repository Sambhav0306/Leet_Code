class Solution {
    public int matrixSum(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
        int score=0;
        int k=nums[0].length-1;
        while(true){
            if(k<0){
                break;
            }
            int max=0;
            for(int i=0;i<nums.length;i++){
                if(max<nums[i][k]){
                    max=nums[i][k];
                }
            }
            score+=max;
            k--;
        }
        return score;
    }
}