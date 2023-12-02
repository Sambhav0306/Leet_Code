class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            char c=chars.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=0;
        for(String s:words){
            int counter=0;
            HashMap<Character,Integer> map1=new HashMap<>(map);
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(map1.containsKey(c)){
                    map1.put(c,map1.get(c)-1);
                    if(map1.get(c)==0) map1.remove(c);
                }else{
                    counter++;
                    break;
                }
            }
            if(counter==0){
                count+=s.length();
            }
        }
        return count;
    }
}