class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(cost1>total && cost2>total){
            return 1;
        }
        long ans=0;
        int max=Math.max(cost1,cost2);
        int min=Math.min(cost1,cost2);
        int i=0;
        while(true){
            if(max*i>total) break;
            int diff=total-max*i;
            ans+=diff/min+1;
            i++;
        }
        return ans;
    }
}