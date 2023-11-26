class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        while(map.size()!=0){
            int i=Collections.max(map.keySet());
            if(i==map.get(i)) return i;
            map.remove(i);
            }
        return -1;
    }
}