class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            map.put(a,map.getOrDefault(a,0)+1);
            map.put(b,map.getOrDefault(b,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==edges.length) return i;
        }
        return -1;
    }
}