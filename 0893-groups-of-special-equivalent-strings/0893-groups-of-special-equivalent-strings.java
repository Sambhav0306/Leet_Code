class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashMap<String,ArrayList<Character>> map1=new HashMap<>();
        HashMap<String,ArrayList<Character>> map2=new HashMap<>();
        for(int i=0;i<words.length;i++){
            ArrayList<Character> odd=new ArrayList<>();
            ArrayList<Character> even=new ArrayList<>();
            String s=words[i];
            for(int j=0;j<s.length();j++){
                if(j%2==1) odd.add(s.charAt(j));
                else even.add(s.charAt(j));
            }
            Collections.sort(odd);
            Collections.sort(even);
            boolean b1=false;
            for(String t:map1.keySet()){
                ArrayList<Character> check1=map1.get(t);
                ArrayList<Character> check2=map2.get(t);
                if(check1.equals(odd) && check2.equals(even)){
                    b1=true;
                    break;
                }
            }
            if(!b1){
                map1.put(s,odd);
                map2.put(s,even);
            }
        }
        return map1.size();
        
    }
}