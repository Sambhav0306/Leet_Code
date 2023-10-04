class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] nums=new boolean[arr.length];
        return f(start,arr,nums);
    }
    public boolean f(int i, int[] arr,boolean[] nums){
        if(i<0 || i>=arr.length|| nums[i]==true){
            return false;
        }
        if(arr[i]==0){
            return true;
        }
        nums[i]=true;
        boolean left=f(i-arr[i],arr,nums);
        boolean right=f(i+arr[i],arr,nums);
        // nums[i]=false;
        return left|right;
    }
}