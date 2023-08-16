class Solution {
    List<String> list=new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        StringBuilder str=new StringBuilder(s);
        f(str,0);
        return list;
    }
    public void f(StringBuilder str,int i){
        if(i==str.length()){
            list.add(str.toString());
            return;
        }
        if(str.charAt(i)>='0' && str.charAt(i)<='9'){
            f(str,i+1);
        }else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
            f(str,i+1);
            char c= (char)(str.charAt(i)+32);
            str.setCharAt(i,c);
            f(str,i+1);
        }else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
            f(str,i+1);
            char c= (char)(str.charAt(i)-32);
            str.setCharAt(i,c);
            f(str,i+1);
        }
    }
}