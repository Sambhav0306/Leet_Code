class Solution {
    public int bestClosingTime(String customers) {
        int p=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                p++;
            }
        }
        int ind=0;
        int ans=p;
        for(int i=1;i<=customers.length();i++){
            if(customers.charAt(i-1)=='Y'){
                ans--;
            }else{
                ans++;
            }
            if(ans<p){
                ind=i;
                p=ans;
            }
        }
        return ind;
    }
}