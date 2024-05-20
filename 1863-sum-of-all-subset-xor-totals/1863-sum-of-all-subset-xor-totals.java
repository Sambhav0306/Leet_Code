class Solution {
    int ans=0;
    public  int subsetXORSum(int[] nums) {
        f(0,nums,0);
        return ans;
    }
    public  void f(int i,int[] nums,int val){
        if(i==nums.length)
        {
            ans+=val;
            return ;
        }
        f(i+1,nums,nums[i]^val);
        f(i+1,nums,val);
//        return take+not_take;
    }
}