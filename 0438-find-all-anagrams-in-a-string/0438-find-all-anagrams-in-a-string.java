class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()<p.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            if(!map.containsKey(p.charAt(i))){
                map.put(p.charAt(i),1);
            }else{
                map.put(p.charAt(i),map.get(p.charAt(i))+1);
            }
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<p.length();i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),1);
            }else{
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }
        }
        for(int i=p.length();i<s.length();i++){
            if(map.equals(map1)){
                list.add(i-p.length());
            }
            char t=s.charAt(i-p.length());
            if(map1.get(t)==1){
                map1.remove(t);
            }else{
                map1.put(t,map1.get(t)-1);
            }
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),1);
            }else{
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }
        }
        if(map.equals(map1)){
            list.add(s.length()-p.length());
        }
        return list;
    }
}