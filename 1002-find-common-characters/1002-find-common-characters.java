class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<words[0].length();i++){
             map.put(words[0].charAt(i),map.getOrDefault(words[0].charAt(i),0)+1);
        }
        for(int i=1;i<words.length;i++){
            String s=words[i];
            Map<Character,Integer> map1=new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                map1.put(s.charAt(j),map1.getOrDefault(s.charAt(j),0)+1);
            }
            for(char c:map.keySet()){
                if(map1.containsKey(c)){
                    map.put(c,Math.min(map.get(c),map1.get(c)));
                }else{
                    map.put(c,-1);
                }
            }
        }
        List<String> list=new ArrayList<>();
        for(char c:map.keySet()){
            int n=map.get(c);
            String s=String.valueOf(c);
            if(map.get(c)!=-1){
                for(int i=0;i<n;i++){
                    list.add(s);
                }
            }
        }
        return list;
    }
}