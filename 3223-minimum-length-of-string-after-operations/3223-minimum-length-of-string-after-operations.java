class Solution {
    public int minimumLength(String s) {
        int i=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(i<s.length()){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)==3) map.put(c,1);
            i++;
        }
        int count=0;
        for(char c:map.keySet()){
            count+=map.get(c);
        }
        return count;
    }
}