class Solution {
    List<List<Integer>>  list=new ArrayList<>();
    HashSet<List<Integer>> set=new HashSet<>();
    HashSet<Integer> set1=new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        f(list1,nums);
        return list;
    }
    public void f(List<Integer> list1,int[] nums){
        if(list1.size()==nums.length){
            if(!set.contains(list1)){
                set.add(new ArrayList<>(list1));
                list.add(new ArrayList<>(list1));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set1.contains(i)){
                set1.add(i);
                list1.add(nums[i]);
                f(list1,nums);
                set1.remove(i);
                list1.remove(list1.size()-1);
            }
        }
    }
}