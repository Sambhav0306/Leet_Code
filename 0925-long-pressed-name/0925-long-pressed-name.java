class Solution {
    public boolean isLongPressedName(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        int i=0;
        int j=0;
        char c=s.charAt(0);
        while(i<s.length()){
            if(j==t.length()){
                return false;
            }
            if(s.charAt(i)==t.charAt(j)){
                c=s.charAt(i);
                i++;
                j++;
            }
            else if(t.charAt(j)!=c) return false;
            else j++;
        }
        while(j<t.length()){
            if(t.charAt(j)!=c) return false;
            j++;
        }
        return true;
    }
}