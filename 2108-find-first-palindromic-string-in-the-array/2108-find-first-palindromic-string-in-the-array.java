class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(f(words[i])) return words[i];
        }
        return "";
    }
    public boolean f(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}