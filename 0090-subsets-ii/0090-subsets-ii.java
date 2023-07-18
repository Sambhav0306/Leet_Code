class Solution {
    HashSet<List<Integer>> set=new HashSet<>();
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list1 =new ArrayList<>();
        f(nums,nums.length-1,list1);
        return list;
    }
    public void f(int[] nums,int ind,List<Integer> list1){
        if(ind==-1){
            if(!set.contains(list1)){
              list.add(new ArrayList<>(list1)); 
              set.add(list1);
            }
            return;
        }
        f(nums,ind-1,list1);
        list1.add(nums[ind]);
        f(nums,ind-1,list1);
        list1.remove(list1.size()-1);
    }
}