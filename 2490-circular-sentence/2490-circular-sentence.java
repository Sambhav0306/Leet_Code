class Solution {
    public boolean isCircularSentence(String s) {
        if(s.charAt(0)!=s.charAt(s.length()-1)) return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(s.charAt(i-1)!=s.charAt(i+1)) return false;
            }
        } 
        return true;
    }
}