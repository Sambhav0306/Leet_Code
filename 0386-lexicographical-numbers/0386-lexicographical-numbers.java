class Solution {
    List<Integer> list=new ArrayList<>();
    int k=0;
    public  List<Integer> lexicalOrder(int n) {
        k=n;
        for(int i=1;i<10;i++){
            f(i);
        }
        return list;
    }
    public void f(int i){
        if(i>k){
            return;
        }
        list.add(i);
        for(int j=0;j<10;j++){
            f(i*10+j);
        }
    }
}