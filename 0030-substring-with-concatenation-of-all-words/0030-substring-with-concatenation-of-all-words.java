class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list=new ArrayList<>();
        int size=words[0].length()*words.length;
        int len=words[0].length();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        int i=0;
        while(i+size<=s.length()){
            String t=s.substring(i,i+size);
            HashMap<String,Integer> map1=new HashMap<>(map);
            int j=0;
            while(j!=t.length()){
                String k=t.substring(j,j+len);
                if(!map1.containsKey(k)) break;
                else{
                    map1.put(k,map1.get(k)-1);
                    if(map1.get(k)==0) map1.remove(k);
                }
                j+=len;
            }
            if(map1.size()==0) list.add(i);
            i++;
        }
        return list;
    }
}