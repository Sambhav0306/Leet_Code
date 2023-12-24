class Solution {
    public int minOperations(String s) {
        int min=100000;
        int count=0;
        char c='0';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c) count++;
            if(c=='0') c='1';
            else c='0';
        }
        min=Math.min(count,min);
        count=0;
        c='1';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c) count++;
            if(c=='0') c='1';
            else c='0';
        }
        min=Math.min(count,min);
        return min;
    }
}