class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for(int j=s.length()-1;j>i;j--){
                if(s.charAt(j)==c){
                    max=Math.max(max,j-i-1);
                    break;
                }
            }
        }
        return max;
        // if(max==-1) return max;
    }
}