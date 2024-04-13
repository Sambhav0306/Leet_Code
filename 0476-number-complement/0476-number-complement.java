class Solution {
    public int findComplement(int num) {
        ArrayList<Integer> list=new ArrayList<>();
        while(num!=0){
            list.add(num%2);
            num/=2;
        }
        Collections.reverse(list);
        int ans=0;
        int j=0;
        // StringBuilder ans=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)==0)ans+=1*(int)Math.pow(2,j);
            j++;
        }
        return ans;
    }
}