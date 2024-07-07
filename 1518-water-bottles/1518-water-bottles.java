class Solution {
    public int numWaterBottles(int n, int m) {
            int ans=0;
            int e=0;
            while(n!=0){
                ans+=n;
                e+=n;
                n=e/m;
                e-=m*n;
            }
            return ans;
        }
}