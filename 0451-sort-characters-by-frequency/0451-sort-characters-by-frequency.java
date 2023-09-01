class Solution {
    public String frequencySort(String s) {
        StringBuilder str=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        while(true){
             int j=Collections.max(map.values());
            if(j==-1){
                break;
            }
            if(j==1){
                for(char c:map.keySet()){
                    if(map.get(c)!=-1){
                        str.append(c);
                    }
                }
                break;
            }
            for(char c:map.keySet()){
                if(map.get(c)==j){
                    for(int i=0;i<j;i++){
                        str.append(c);
                    }
                    map.put(c,-1);
                }
            }
        }
        return str.toString();
    }
}