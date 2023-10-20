class Solution {
    public long getDescentPeriods(int[] prices) {
        long maxi=0,res=0,val=0;
        for(int i:prices){
            if(maxi-i==1){
                maxi=i;
                res+=(val+1);
                val=val+1;
            }
            else{
                maxi=i;
                val=1;
                res+=1;
            }
        }
        return res;
    }
}