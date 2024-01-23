class Solution {
    int max=0;
    public int maxLength(List<String> arr) {
        StringBuilder str=new StringBuilder();
        f(str,0,arr);
        return max;
    }
    public void f(StringBuilder str,int i,List<String> arr){
        if(i==arr.size()) return;
        String s=arr.get(i);
        str.append(s);
        boolean bool=true;
        HashSet<Character> set=new HashSet<>();
        for(char c:str.toString().toCharArray()){
            if(set.contains(c)) bool=false;
            // f(str,i+1,arr);
            set.add(c);
        }
        if(bool){
            max=Math.max(str.length(),max);
            f(str,i+1,arr);
        }
        str.delete(str.length()-s.length(),str.length());
        f(str,i+1,arr);
        return;
    }
}