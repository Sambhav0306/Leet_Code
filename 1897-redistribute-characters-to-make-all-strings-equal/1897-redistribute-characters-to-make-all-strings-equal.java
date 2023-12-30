class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            }
        }
        int n=words.length;
        for(char c:map.keySet()){
            if(map.get(c)%n!=0) return false;
        }
        return true;
    }
}