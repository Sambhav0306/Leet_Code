class Solution {
    public boolean judgeSquareSum(int c) {
       long n=(long)c;
       long s=0;
       long e=(long)(Math.pow(c,0.5));
       while(e>=s){
           long mid=s*s + e*e;
           if((int)mid==n){
               return true;
           }else if(mid>n){
               e--;
           }else{
               s++;
           }
       }
        return false;
    }
}