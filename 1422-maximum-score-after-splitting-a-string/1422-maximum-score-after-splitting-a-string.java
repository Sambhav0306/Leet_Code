class Solution {
    public int maxScore(String s) {
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') ones++;
        }
        if(ones==0) return s.length()-1;
        int zeros=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1 && s.charAt(i)=='0') continue;
            if(s.charAt(i)=='1') ones--;
            else zeros++;
            max=Math.max(max,ones+zeros);
        }
        return max;
    }
}