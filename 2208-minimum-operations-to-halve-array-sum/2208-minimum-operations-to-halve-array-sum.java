class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq =new PriorityQueue<>((x, y) -> Double.compare(y, x));
        double add=0;
        for(int i:nums){
            pq.add((double)i);
            add+=(double)i;
        }
        // return 0;
        double half=add/2;
        int count=0;
        while(add>half){
            double a=pq.poll();
            add-=a;
            a=a/2;
            add+=a;
            pq.add(a);
            count++;
        }
        return count;
    }
}