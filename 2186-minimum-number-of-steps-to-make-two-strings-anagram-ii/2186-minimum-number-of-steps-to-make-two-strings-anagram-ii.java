class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),1);
            }else{
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),1);
            }else{
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            }
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                if(map2.containsKey(s.charAt(i))){
                    count+=Math.abs(map1.get(s.charAt(i))-map2.get(s.charAt(i)));
                    map1.remove(s.charAt(i));
                    map2.remove(s.charAt(i));
                }else{
                    count+=map1.get(s.charAt(i));
                    map1.remove(s.charAt(i));
                }
            }
        }
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                count+=map2.get(t.charAt(i));
                map2.remove(t.charAt(i));
            }
        }
        return count;
    }
}