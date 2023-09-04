class Solution {
    public  boolean isNStraightHand(int[] hand, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        Arrays.sort(hand);
        for(int i=0;i<hand.length;i++){
            if(!map.containsKey(hand[i])){
                map.put(hand[i],1);
            }else{
                map.put(hand[i],map.get(hand[i])+1);
            }
        }
        for(int i=0;i<hand.length;i++){
            if(map.get(hand[i])==0) {continue;}
            List<Integer> list=new ArrayList<>();
            list.add(hand[i]);
            map.put(hand[i],map.get(hand[i])-1);
            int a=map.get(hand[i]);
            int j=0;
            while(list.size()!=k){
                if(!map.containsKey(list.get(j)+1)|| map.get(list.get(j)+1)==0){
                    break;
                }else{
                    list.add(list.get(j)+1);
                    map.put(list.get(j)+1,map.get(list.get(j)+1)-1);
                    j++;
                }
            }
            // System.out.println(list);
            if(list.size()!=k) return false;
        }
        return true;
    }
}