class Solution {
    public long smallestNumber(long num) {
        int check=0;
        if(num==0) return 0;
        if(num<0){
            check=1;
            num=-num;
        }
        List<Long> list=new ArrayList<>();
        while(num!=0){
            list.add(num%10);
            num=num/10;
        }
        Collections.sort(list);
        long ans=0;
        if(check==1){
            for(int i=list.size()-1;i>=0;i--){
                ans=ans*10+list.get(i);
            }
           ans=-ans; 
        }else{
            int count=0;
            int j=0;
             while(list.get(j)==0){
                 count++;
                 j++;
             }
            ans=list.get(j);
            while(count!=0){
                ans*=10;
                count--;
            }
            j++;
            while(j<list.size()){
                ans=ans*10+list.get(j);
                j++;
            }
        }
        return ans;
    }
}