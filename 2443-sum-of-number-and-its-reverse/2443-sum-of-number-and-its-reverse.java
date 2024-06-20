class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
       for(int i=1;i<=num;i++){
           int b=num-i;
           if(f(i,b)) return true;
       }   
        return false;
    }
    public boolean f(int i,int b){
        int n=0;
        while(i!=0){
            int rem=i%10;
            n=n*10 +rem;
            i/=10;
        }
        if(n==b) return true;
        return false;
    }
}