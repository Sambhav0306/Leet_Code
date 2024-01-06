class Solution {
    public String maxValue(String n, int x) {
        StringBuilder s=new StringBuilder(n);
        char ch=(char)(x+'0');
        if(s.charAt(0)=='-'){
            boolean bool=true;
            for(int i=0;i<s.length();i++){
                int a=s.charAt(i)-'0';
                if(a>x){
                    bool=false;
                    s.insert(i,ch);
                    break;
                }
            }
            if(bool) s.append(ch);
        }else{
            boolean bool=true;
            for(int i=0;i<s.length();i++){
                int a=s.charAt(i)-'0';
                if(a<x){
                    bool=false;
                    s.insert(i,ch);
                    break;
                }
            }
            if(bool)s.append(ch);
        }
        return s.toString();
    }
}