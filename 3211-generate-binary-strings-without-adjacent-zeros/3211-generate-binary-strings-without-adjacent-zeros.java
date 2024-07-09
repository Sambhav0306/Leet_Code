class Solution {
    List<String> list=new ArrayList<>();
    public List<String> validStrings(int n) {
        StringBuilder str=new StringBuilder();
        f(n,str,0);
        return list;
    }
    public void f(int n,StringBuilder str,int check){
        if(n==0){
            list.add(new String(str.toString()));
            return;
        }
        str.append('1');
        f(n-1,str,0);
        str.deleteCharAt(str.length()-1);
        if(check==0){
            str.append('0');
            f(n-1,str,1);
            str.deleteCharAt(str.length()-1);
        }
        return;
    }
}