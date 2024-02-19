class Solution {
    public String lastNonEmptyString(String s) {
        StringBuilder str=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int val=Collections.max(map.values());
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c)==val) {
                str.append(c);
                map.remove(c);
            }
        }
        return str.reverse().toString();
    }
}