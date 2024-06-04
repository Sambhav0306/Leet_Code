class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int odd=0;
        for(char c:map.keySet()){
            if(map.get(c)%2==0) ans+=map.get(c);
            else{
                ans+=map.get(c)-1;
                odd++;
            }
        }
        if(odd==0) return ans;
        else return ans+1;
    }
}