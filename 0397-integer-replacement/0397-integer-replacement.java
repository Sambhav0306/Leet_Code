class Solution {
    public int integerReplacement(int n) {
        if(n==Integer.MAX_VALUE) return 32;
        return f(n);
    }
    public int f(int n){
        if(n==1) return 0;
        int even=Integer.MAX_VALUE;
        int odd1=Integer.MAX_VALUE;
        int odd2=Integer.MAX_VALUE;
        if(n%2==0) even=1+f(n/2);
        else{
            if(n!=Integer.MAX_VALUE)odd1=1+f(n+1);
            odd2=1+f(n-1);
        }
        return Math.min(odd1,Math.min(odd2,even));
    }
}