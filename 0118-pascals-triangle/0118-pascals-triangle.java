class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        list2.add(1);
        list.add(list2);
        if(n==1){
            return list;
        }
        list3.add(1);
        list3.add(1);
        list.add(list3);
        for(int i=2;i<n;i++){
            ArrayList<Integer> list1=new ArrayList<>();
            list1.add(1);
            list1.add(1);
            int j=1;
            while(list1.size()!=list.get(i-1).size()+1){
                list1.add(j,list.get(i-1).get(j-1)+list.get(i-1).get(j));
                j++;
            }
            list.add(list1);
        }
        return list;
    }
}