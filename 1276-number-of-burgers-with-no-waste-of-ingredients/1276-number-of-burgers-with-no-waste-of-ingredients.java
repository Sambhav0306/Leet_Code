class Solution {
    public List<Integer> numOfBurgers(int n1, int n2) {
        List<Integer> list=new ArrayList<>();
        if(n1==2 && n2==1){
            list.add(0);
            list.add(1);
            return list;
        }
        if(n1%2==1) return list;
        int n4=0;
        while(n4*4<=n1){
            int n=n1;
            int m=n2;
            n-=n4*4;
            m-=n4;
            if(n/2==m){
                list.add(n4);
                list.add(n/2);
                return list;
            }
            n4++;
        }
        return list;
    }
}