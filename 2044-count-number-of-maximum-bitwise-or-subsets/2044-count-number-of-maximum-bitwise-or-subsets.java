class Solution {
    int count=0;
    int max=0;
    public int countMaxOrSubsets(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            f(i, 0, nums);
        }

        return count;
    }
    public  void f(int i,int sub,int[] nums){
        if(i==nums.length) return;
        int s=sub|nums[i];
        if(s>max){
            max=s;
            count=0;
        }
        if(max==s) count++;
        for(int j=i+1;j<nums.length;j++){
            f(j,s,nums);
//            f(j,sub,nums);
        }
        return;
    }}