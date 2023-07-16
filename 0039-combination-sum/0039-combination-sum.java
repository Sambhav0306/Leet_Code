class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer> list1=new ArrayList<>();
        f(candidates,target,0,list1);
        return list;
    }
    public void f(int[] candidates,int target,int ind,ArrayList<Integer> list1){
        if(target==0){
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(candidates[i]>target){
                break;
            }
            if(target-candidates[i]>=0){
                list1.add(candidates[i]);
                f(candidates,target-candidates[i],i,list1);
                list1.remove(list1.size()-1);
            }
        }
    }
}