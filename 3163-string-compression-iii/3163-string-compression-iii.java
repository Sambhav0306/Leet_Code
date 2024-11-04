class Solution {
    public String compressedString(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int j=i;
            int n=0;
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                n++;
                j++;
                if(n==9) break;
            }
            char c1=(char)(n+'0');
            str.append(c1);
            str.append(s.charAt(i));
            i=j-1;
        }
        return str.toString();
    }
}