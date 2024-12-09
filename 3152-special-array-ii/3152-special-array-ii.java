class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans=new boolean[queries.length];
        int[] arr=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==nums[i-1]%2){
                arr[i]=1+arr[i-1];
            }else arr[i]=arr[i-1];
        }
        for(int i=0;i<queries.length;i++){
            if(arr[queries[i][0]]==arr[queries[i][1]]) ans[i]=true;
        }
        return ans;
    }
}