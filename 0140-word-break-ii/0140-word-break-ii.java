class Solution {
    HashSet<String> set=new HashSet<>();
    List<String> list=new ArrayList<>();
    public List<String> wordBreak(String s, List<String> words) {
        for(int i=0;i<words.size();i++){
            set.add(words.get(i));
        }
        StringBuilder str=new StringBuilder();
        f(0,s,str);
        return list;
    }
    public void f(int i,String s,StringBuilder str){
        if(i==s.length()){
            str.delete(str.length()-1,str.length());
            list.add(str.toString());
            str.append(' ');
            return;
        }
        for(String s1:set){
            if(s.indexOf(s1,i)==i){
                str.append(s1);
                str.append(' ');
                f(i+s1.length(),s,str);
                str.delete(str.length()-s1.length()-1,str.length());
            }
        }
        return;
    }
}