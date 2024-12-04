class Solution {
    public boolean canMakeSubsequence(String s1, String s2) {
        int j=0;
        for(int i=0;i<s1.length();i++){
            if(j==s2.length()) break;
            char c=s1.charAt(i);
            char c1=s2.charAt(j);
            if(c==c1) j++;
            else if(c=='z' && c1=='a') j++;
            else{
                char c2=(char)(c+1);
                if(c1==c2) j++;
            }
        }
        if(j==s2.length()) return true;
        return false;
    }
}