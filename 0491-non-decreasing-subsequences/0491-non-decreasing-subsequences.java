class Solution {
    List<List<Integer>> list=new ArrayList<>();
    HashSet<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            list1.add(nums[i]);
            f(i+1,nums,list1);
            list1.remove(list1.size()-1);
        }
        return list;
    }
    public void f(int i,int[] nums,List<Integer> list1){
        if(i>=nums.length){
            return;
        }
        if(nums[i]>=list1.get(list1.size()-1)){
            list1.add(nums[i]);
            if(!set.contains(list1)){
            list.add(new ArrayList<>(list1));
            set.add(new ArrayList<>(list1));
            }
            f(i+1,nums,list1);
            list1.remove(list1.size()-1);
        }
            f(i+1,nums,list1);
    }
}