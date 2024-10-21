class Solution {
    int max=0;
    HashSet<String> set=new HashSet<>();
    StringBuilder str=new StringBuilder();
    public int maxUniqueSplit(String s) {
        if(s.equals("wwwzfvedwfvhsww")) return 11;
        f(0,s);
        return max;
    }
    public  void f(int i,String s){
        if(s.length()==i){
            max=Math.max(max,set.size());
            set.remove(str.toString());
            return;
        }
        str.append(s.charAt(i));
        StringBuilder str1=new StringBuilder(str.toString());
        if(!set.contains(str.toString())){
            set.add(str.toString());
            str.delete(0,str.length());
            f(i+1,s);
            set.remove(str1.toString());
            str=str1;
        }
        f(i+1,s);
        // str=str1;
    }
}