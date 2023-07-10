class Solution {
    public int bagOfTokensScore(int[] nums, int power) {
        Arrays.sort(nums);
        if(nums.length==1){
            if(power>=nums[0]){
                return 1;
            }else{
                return 0;
            }
        }
        int i=0;
        int j=nums.length-1;
        int score=0;
        while(j>=i){
            if(score==0 && power<nums[i]){
                break;
            }
            int a=nums[i];
            if(power>=nums[i]){
                while(j>=i && power>=nums[i]){
                    score++;
                    power-=nums[i];
                    i++;
                }
            }
            if(score>0 && j>i){
                power+=nums[j];
                score--;
                j--;
            }else{
                break;
            }
        }

        return score;
    }
}