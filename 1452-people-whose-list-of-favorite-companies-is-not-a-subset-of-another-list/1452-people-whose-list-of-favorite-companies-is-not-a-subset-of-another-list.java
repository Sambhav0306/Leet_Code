class Solution {
    public List<Integer> peopleIndexes(List<List<String>> list) {
        List<Integer> f=new ArrayList<>();
        HashSet<Integer> nums=new HashSet<>();
        for(int i=0;i<list.size();i++){
            if(nums.contains(i)) continue;
            HashSet<String> set=new HashSet<>();
            for(int j=0;j<list.get(i).size();j++){
                set.add(list.get(i).get(j));
            }
            for(int j=0;j<list.size();j++){
                if(set.containsAll(list.get(j))){
                    if(i==j) continue;
                    nums.add(j);
                }
            }
        }
         for(int i=0;i<list.size();i++){
             if(!nums.contains(i)) f.add(i);
         }
          return f;      
    }
}