class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0;
        for(int i=0;i<s.length()/2;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') count++;
        }
        for(int i=s.length()/2;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') count--;
        }
        if(count==0) return true;
        return false;
    }
}