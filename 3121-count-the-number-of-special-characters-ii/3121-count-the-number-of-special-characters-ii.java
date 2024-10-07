class Solution {
    public int numberOfSpecialChars(String s) {
        HashSet<Character> set=new HashSet<>();
        HashSet<Character> set1=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                set1.add(c);
            }else{
                char a=(char)(c-32);
                if(!set.contains(c)){
                    if(!set1.contains(a)){
                        set.add(c);
                    }
                }
                else if(set.contains(c)){
                    if(set1.contains(a)){
                        set.remove(c);
                    }
                }
            }
        }
        int count=0;
        for(char c:set){
            char a=(char)(c-32);
            if(set1.contains(a)){
                count++;
            }
        }
        return count;
    }
}