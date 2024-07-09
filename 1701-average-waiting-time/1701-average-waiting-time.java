class Solution {
    public double averageWaitingTime(int[][] nums) {
        double ans=0;
        int time=nums[0][0];
        for(int i=0;i<nums.length;i++){
            if(time>=nums[i][0]){
                time+=nums[i][1];
                ans+=(time-nums[i][0]);
            }else{
                time=nums[i][0];
                time+=nums[i][1];
                ans+=(time-nums[i][0]);
            }
        } 
        return ans/nums.length;
    }
}