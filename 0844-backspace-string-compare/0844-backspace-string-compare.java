class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        int i=0;
        int j=0;
        while(i<s.length()){
            if(s.charAt(i)=='#'){
                if(s1.size()==0){
                    i++;
                    continue;
                }else{
                    s1.pop();
                    i++;
                }
            }else{
                s1.push(s.charAt(i));
                i++;
            }
        }
        i=0;
        while(i<t.length()){
            if(t.charAt(i)=='#'){
                if(s2.size()==0){
                    i++;
                    continue;
                }else{
                    s2.pop();
                    i++;
                }
            }else{
                s2.push(t.charAt(i));
                i++;
            }
        }
        if(s1.size()!=s2.size()) return false;
        while(s1.size()!=0){
            if(s1.pop()!=s2.pop()) return false;
        }
        return true;
    }
}