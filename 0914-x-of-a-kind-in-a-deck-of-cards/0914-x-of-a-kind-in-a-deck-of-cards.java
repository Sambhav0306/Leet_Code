class Solution {
    List<Integer> list=new ArrayList<>();
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
        f(min);
        for(int i=0;i<list.size();i++){
            int count=0;
            for(int j:map.keySet()){
            if(map.get(j)%list.get(i)!=0) count++;
        }
        if(count==0) return true;
        }
        return false;
    }
    public void f(int min){
        int i=min;
        while(i!=1){
            if(min%1==0) list.add(i);
            i--;
        }
    }
}