class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        if( rowIndex==0){
            return list;
        }
        list.add(1);
        for(int i=2;i<=rowIndex;i++){
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            list1.add(1);
            int j=1;
            while(j!=list.size()){
                list1.add(j,list.get(j)+list.get(j-1));
                j++;
            }
            list=list1;
        }
        return list;
    }
}