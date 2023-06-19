class Solution {
    public int largestAltitude(int[] gain) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(sum>ans){
                ans=sum;
            }
        }
        if(ans<0){
            return 0;
        }
        return ans;
    }
}