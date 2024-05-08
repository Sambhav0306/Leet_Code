class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:score){
            pq.add(i);
        }
        String[] nums=new String[score.length];
        int k=score.length;
        while(pq.size()!=0){
            int o=pq.poll();
            for(int i=0;i<score.length;i++){
                if(o==score[i]){
                     if(k==3) nums[i]="Bronze Medal";
                     else if(k==2) nums[i]="Silver Medal";
                     else if(k==1) nums[i]="Gold Medal";
                     else nums[i]=Integer.toString(k);
                    k--;
                    break;
                }
            }
        }
        
        return nums;
    }
}