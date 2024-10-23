class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count=0;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        while(i<s.length()){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(s.charAt(i))==k) break;
            i++;
        }
        count+=s.length()-i;
//        i++;
        int j=0;
        while(i<s.length() && j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(Collections.max(map.values())!=k){
                i++;
                while(i<s.length()){
                    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                    if(map.get(s.charAt(i))==k) break;
                    i++;
                }
                count+=s.length()-i;
            }else count+=s.length()-i;
            j++;
        }
//        while (j<s.length()){
//            char ch=s.charAt(j);
//            map.put(ch,map.getOrDefault(ch,0)-1);
//            if(Collections.max(map.values())>=k) count+=
//        }
        return count;
    }
}
