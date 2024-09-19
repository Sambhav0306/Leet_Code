class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        map.put('a',0);
        map.put('b',0);
        map.put('c',0);
        int i=0;
        int j=0;
        while(j<s.length()){
            if(map.get('a')>0 && map.get('b')>0 && map.get('c')>0){
                break;
            }
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            j++;
        }
        i++;
        if(map.get('a')>0 && map.get('b')>0 && map.get('c')>0) count+=s.length()-j+1;

        while(i<s.length() && j<s.length()){
            map.put(s.charAt(i-1),map.get(s.charAt(i-1))-1);
            if(map.get('a')>0 && map.get('b')>0 && map.get('c')>0){
                count+=s.length()-j+1;
            }else{
                while(j<s.length()){
                    if(map.get('a')>0 && map.get('b')>0 && map.get('c')>0){
                        break;
                    }
                    map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                    j++;
                }
                if(map.get('a')>0 && map.get('b')>0 && map.get('c')>0) count+=s.length()-j+1;
            }
            i++;
        }
        while(i<s.length()){
            map.put(s.charAt(i-1),map.get(s.charAt(i-1))-1);
            if(map.get('a')>0 && map.get('b')>0 && map.get('c')>0){
                count++;
            }else break;
            i++;
        }
        return count;
    }
}