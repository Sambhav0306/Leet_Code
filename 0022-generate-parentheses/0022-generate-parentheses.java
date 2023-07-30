class Solution {
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder str=new StringBuilder();
        f(0,0,n,str);
        return list;
    }
    public void f(int i,int j,int n,StringBuilder str){
        if(str.length()==n*2){
            String s= str.toString(); 
            list.add(s);
            return;
        }
        if(i<n){
            str.append('(');
            f(i+1,j,n,str);
            str.deleteCharAt(str.length()-1);
        }
        if(j<i && j<n){
            str.append(')');
            f(i,j+1,n,str);
            str.deleteCharAt(str.length()-1);
        }
        return;
    }
}