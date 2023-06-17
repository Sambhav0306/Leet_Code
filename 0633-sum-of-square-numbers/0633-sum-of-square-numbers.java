class Solution {
    public boolean judgeSquareSum(int c) {
        int a=1;
        if(c==0){
            return true;
        }
        while(Math.pow(a,2)<=c){
            int diff=c-(int)Math.pow(a,2);
            if(Math.pow(diff,0.5)==(int)Math.pow(diff,0.5)){
                return true;
            }
            a++;
        }
        return false;
    }
}