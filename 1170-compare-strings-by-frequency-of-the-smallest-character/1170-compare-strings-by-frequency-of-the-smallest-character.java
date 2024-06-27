class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] store=new int[words.length];
        int[] ans=new int[queries.length];
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            HashSet<Character> set=new HashSet<>();
            String s=words[i];
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
                set.add(c);
            }
            store[i]=map.get(Collections.min(set));
        }
        for(int i=0;i<queries.length;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            HashSet<Character> set=new HashSet<>();
            String s=queries[i];
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
                set.add(c);
            }
            int c=map.get(Collections.min(set));
            int answer=0;
            for(int j=0;j<store.length;j++){
                if(c<store[j]) answer++;
            }
            ans[i]=answer;
        }
        return ans;
    }
}