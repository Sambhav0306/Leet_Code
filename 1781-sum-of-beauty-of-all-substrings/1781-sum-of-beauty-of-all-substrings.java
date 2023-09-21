class Solution {
    public int beautySum(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                if(map.containsKey(c)){
                  map.put(c,map.get(c)+1);
                }else{
                  map.put(c,1);
                }
                int max=Collections.max(map.values());
                int min=Collections.min(map.values());
                if(max-min!=0){
                    count+=max-min;
                }
            }
        }
        return count;
    }
}