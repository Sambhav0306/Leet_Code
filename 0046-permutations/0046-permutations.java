class Solution {
     List<List<Integer>> list=new ArrayList<>();
    HashSet<Integer> set=new HashSet<>();
    public List<List<Integer>> permute(int[] nums) {
         ArrayList<Integer> list1=new ArrayList<>();
        f(nums,list1);
        return list;
        
    }
    public void f(int[] nums,ArrayList<Integer> list1){
        if(list1.size()==nums.length){
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                list1.add(nums[i]);
                f(nums,list1);
                list1.remove(list1.size()-1);
                set.remove(nums[i]);
            }
        }
    }
}