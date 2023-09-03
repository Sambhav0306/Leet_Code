class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<deck.length;i++){
            if(!map.containsKey(deck[i])){
                map.put(deck[i],1);
            }else{
                map.put(deck[i],map.get(deck[i])+1);
            }
        }
        int min=Collections.min(map.values());
        if(min==1) return false;
        for(int i=2;i<=min;i++){
            int count=0;
            for(int j:map.keySet()){
            if(map.get(j)%i!=0) count++;
        }
        if(count==0) return true;
        }
        return false;
    }
}