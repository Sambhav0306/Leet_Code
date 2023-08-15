class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> list1=new ArrayList<>();
        while(map.size()!=0){
            HashSet<Integer> set=new HashSet<>();
            for(int i:map.keySet()) {
                list1.add(i);
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) {
                    set.add(i);
                }
            }
            Iterator<Integer> it = set.iterator();
            while(it.hasNext()){
                map.remove(it.next());
            }
            set.clear();
            list.add(new ArrayList<>(list1));
            list1.clear();
        }
        return list;
    }
}