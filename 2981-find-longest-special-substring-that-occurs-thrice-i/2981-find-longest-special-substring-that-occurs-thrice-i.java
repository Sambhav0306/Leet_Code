class Solution {
    public int maximumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        if(Collections.max(map.values())<3) return -1;
        else{
            int max=1;
            for(char c:map.keySet()){
                int k=map.get(c)-2;
                while(k>1){
                    int count=0;
                    for(int i=0;i<s.length();i++){
                        int c1=0;
                        int j=i;
                        while(j<s.length()){
                            if(s.charAt(j)==c){
                                c1++;
                                if(c1==k) break;
                            }
                            else break;
                            j++;
                        }
                        if(c1==k) count++;
                    }
                    if(count>=3){
                        max=Math.max(max,k);
                        break;
                    }
                    k--;
                }
            }
            return max;
        }
    }
}