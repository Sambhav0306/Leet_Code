class Solution {
    public List<List<Integer>> groupThePeople(int[] nums) {
       List<List<Integer>> list=new ArrayList<>();
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(i);
                map.put(nums[i],new ArrayList<>(list1));
            }else{
                List<Integer> list2=map.get(nums[i]);
                list2.add(i);
                map.put(nums[i],new ArrayList<>(list2));
            }
        }
        for(int i:map.keySet()){
            ArrayList<Integer> list1=map.get(i);
            for(int j=0;j<list1.size();j++){
                List<Integer> list2=new ArrayList<>();
                for(int a=0;a<i;a++){
                    list2.add(list1.get(j));
                    j++;
                }
                j--;
                list.add(new ArrayList<>(list2));
            }
        }
        return list;
    }
}