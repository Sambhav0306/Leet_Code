public class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
class Solution {
    public long maximumImportance(int n, int[][] roads) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Integer.compare(p1.getSecond(), p2.getSecond());
            }
        });
        int[] arr=new int[n];
        for(int i=0;i<roads.length;i++){
            arr[roads[i][0]]=arr[roads[i][0]]+1;
            arr[roads[i][1]]=arr[roads[i][1]]+1;
        }
        for(int i=0;i<arr.length;i++){
            pq.add(new Pair(i,arr[i]));
        }
        int val=1;
        while(!pq.isEmpty()){
            int ind=pq.poll().getFirst();
            arr[ind]=val;
            val++;
        }
        long ans=0;
        for(int i=0;i<roads.length;i++){
            ans+=arr[roads[i][0]]+arr[roads[i][1]];
        }
        return ans;
    }
}