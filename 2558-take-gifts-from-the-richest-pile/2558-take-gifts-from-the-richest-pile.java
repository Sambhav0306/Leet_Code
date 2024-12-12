class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts){
            pq.add(i);
        }
        while(k!=0){
            int b=pq.poll();
            int a=(int)Math.pow(b,1 / 2.0);
            pq.add(a);
            k--;
        }
        while(pq.size()!=0){
            ans+=pq.poll();
        }
        return ans;
    }
}