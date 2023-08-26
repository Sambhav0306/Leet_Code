class Solution {
    public boolean isHappy(int n) {
     HashSet<Integer> set=new HashSet<>();
        while(true){
           // int sum=0;
            int ans=f(0,n);
            if(set.contains(ans)){
                return false;
            }
            if(ans==1){
                return true;
            }
            set.add(ans);
            n=ans;
        }
        // return false ;
    }
    public int f(int sum,int n){
        while(n!=0){
            int rem=n%10;
            sum+=(int)Math.pow(rem,2);
            n=n/10;
        }
        return sum;
    }
}