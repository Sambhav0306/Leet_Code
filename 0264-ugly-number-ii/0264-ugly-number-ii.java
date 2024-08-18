class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        HashSet<Long> set=new HashSet<>();
        long one=1;
        pq.add(one);
        set.add(one);
        while(n!=0){
            long a=pq.poll();
            n--;
            if(n==0) {
                return (int)a;
            }
            if(!set.contains(a*2)) {
                pq.add(a*2);
                set.add(a*2);
            }
            if(!set.contains(a*3)) {
                set.add(a*3);
                pq.add(a*3);
            }
            if(!set.contains(a*5)) {
                pq.add(a*5);
                set.add(a*5);
            }
        }
        return 1;
    }
}