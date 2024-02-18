class Solution {
    public int divide(int dividend, int divisor) {
        int ans=dividend/divisor;
        if( dividend==-2147483648 && divisor==-1){
            return 2147483647;
        }
        if(ans>Math.pow(2,31)-1){
            return (int)Math.pow(2,31)-1;
        }
        if(ans<Math.pow(-2,31)-1){
            return (int)Math.pow(-2,31);
        }
        return ans;
    }
}