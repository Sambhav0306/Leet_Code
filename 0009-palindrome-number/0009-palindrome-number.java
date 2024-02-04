class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=x;
        int sum=0;
        while(y!=0){
            sum=sum*10+ y%10;
            y=y/10;
        }
        if(x==sum){
            return true;
        }
        return false;
    }
}