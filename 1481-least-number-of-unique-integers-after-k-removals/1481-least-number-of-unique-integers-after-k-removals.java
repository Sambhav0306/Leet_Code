class Solution {
    public int findLeastNumOfUniqueInts(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:map.keySet()){
            pq.add(map.get(i));
        }
        while(k!=0){
            int a=pq.poll();
            if(--a!=0) pq.add(a);
            k--;
        }
        return pq.size();
    }
}