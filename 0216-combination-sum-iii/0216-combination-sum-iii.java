class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list1=new ArrayList<>();
        f(k,n,list1,1);
        return list;
    }
    public void f(int k,int n, List<Integer> list1,int i){
        if(list1.size()==k){
            if(n==0){
                list.add(new ArrayList<>(list1));
            }
            return;
        }
        for(int a=i;a<=9 && n>=a;a++){
            list1.add(a);
            f(k,n-a,list1,a+1);
            list1.remove(list1.size()-1);
        }
        return ;
    }
}