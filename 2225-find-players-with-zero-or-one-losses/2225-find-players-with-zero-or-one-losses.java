class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            if(!map.containsKey(matches[i][1])){
                map.put(matches[i][1],1);
            }else{
                map.put(matches[i][1],map.get(matches[i][1])+1);
            }
        }
        for(int i=0;i<matches.length;i++){
            if(!map.containsKey(matches[i][0])){
                list1.add(matches[i][0]);
                map.put(matches[i][0],23);
            }
        }
        Collections.sort(list1);
        for(int i:map.keySet()){
            if(map.get(i)==1){
                list2.add(i);
            }
        }
        Collections.sort(list2);
        list.add(list1);
        list.add(list2);
        return list;
    }
}