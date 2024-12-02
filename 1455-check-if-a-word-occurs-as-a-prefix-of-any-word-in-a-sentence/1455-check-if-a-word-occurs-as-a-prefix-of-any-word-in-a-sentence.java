class Solution {
    public int isPrefixOfWord(String str, String s) {
        int i=0;
        int count=1;
        while(i<str.length()){
            StringBuilder str1=new StringBuilder();
            int j=i;
            while(j<str.length() && str.charAt(j)!=' '){
                str1.append(str.charAt(j));
                j++;
            }
            if(str1.toString().indexOf(s)==0) return count;
            count++;
            i=j;
            i++;
        }
        return -1;
    }
}