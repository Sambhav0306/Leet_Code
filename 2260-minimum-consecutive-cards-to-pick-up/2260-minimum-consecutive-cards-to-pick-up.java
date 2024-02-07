class Solution {
    public int minimumCardPickup(int[] cards) {
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<cards.length;i++){
            if(!map.containsKey(cards[i])){
                map.put(cards[i],i);
            }else{
                int diff=i-map.get(cards[i])+1;
                min=Math.min(diff,min);
                map.put(cards[i],i);
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}