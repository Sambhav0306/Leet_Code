class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list1=new ArrayList<>();
        f(1,n,k,list1);
        return list;
    }
    public void f(int ind,int n,int k,List<Integer> list1){
        if(list1.size()==k){
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=ind;i<=n;i++){
            list1.add(i);
            f(i+1,n,k,list1);
            list1.remove(list1.size()-1);
        }
    }
}