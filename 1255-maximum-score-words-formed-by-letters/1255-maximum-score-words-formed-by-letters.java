class Solution {
    HashMap<Character,Integer> map=new HashMap<>();
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        for(char c:letters){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return f(0,words,letters,score); 
    }
    public int f(int i,String[] words, char[] letters, int[] score){
        if(i==words.length) return 0;
        int take=0;
        int not_take=f(i+1,words,letters,score);
        boolean bool=true;
        int sum=0;
        String s=words[i];
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(!map.containsKey(c)){
                bool=false;
                for(int k=j-1;k>=0;k--){
                    char c1=s.charAt(k);
                    map.put(c1,map.getOrDefault(c1,0)+1);
                }
                break;
            }else{
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
                sum+=score[c-'a'];
            }
        }
        if(bool){
            take=sum+f(i+1,words,letters,score);
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        return Math.max(take,not_take);
    }
}