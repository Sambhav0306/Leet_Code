class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        long score=0;
        while(k!=0){
            int remove=pq.poll();
            score+=remove;
            int a=0;
            if(remove%3==0) a=remove/3;
            else a=remove/3+1;
            pq.add(a);
            k--;
        }
        return score;
    }
}