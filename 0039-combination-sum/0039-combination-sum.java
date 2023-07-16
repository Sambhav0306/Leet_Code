class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer> list1=new ArrayList<>();
        f(candidates,target,0,list1);
        return list;
    }
    public void f(int[] candidates,int target,int ind,ArrayList<Integer> list1){
        if(ind==candidates.length){
            return;
        }
        if(target==0){
            list.add(new ArrayList<>(list1));
            return;
        }
        // for(int i=ind;i<candidates.length;i++)
            if(candidates[ind]>target){
                return;
            }
                list1.add(candidates[ind]);
                f(candidates,target-candidates[ind],ind,list1);
                list1.remove(list1.size()-1);
                f(candidates,target,ind+1,list1);
    }
}