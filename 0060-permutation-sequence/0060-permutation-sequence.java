class Solution {
     int a=0;
     HashSet<Integer> set=new HashSet<>();
     public String getPermutation(int n, int k) {
        StringBuilder str=new StringBuilder();
        StringBuilder s=f(str,n,k);
        return s.toString();
    }
     public StringBuilder f(StringBuilder str,int n,int k){
        if(str.length()==n){
            a++;
            return str;
        }
        for(int i=1;i<=n;i++){

            if(!set.contains(i)){
                set.add(i);
                str.append(i);
                f(str,n,k);
                if(a==k){
                    break;
                }
                set.remove(i);
                str.deleteCharAt(str.length()-1);
            }
        }
        return str;
    }
}