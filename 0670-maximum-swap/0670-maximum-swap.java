class Solution {
    public int maximumSwap(int num) {
        ArrayList<Integer> list=new ArrayList<>();
        while(num!=0){
            list.add(0,num%10);
            num=num/10;
        }
        int ind=0;
        for(int i=0;i<list.size();i++){
            int max=list.get(i);
            for(int j=list.size()-1;j>i;j--){
                if(max<list.get(j)){
                    max=list.get(j);
                    ind=j;
                }
            }
            if(max!=list.get(i)){
                int temp=list.get(i);
                list.set(i,list.get(ind));
                list.set(ind,temp);
                break;
            }
        }
        num=0;
        for(int i=0;i<list.size();i++){
            num=num*10+list.get(i);
        }
        return num;
    }
}