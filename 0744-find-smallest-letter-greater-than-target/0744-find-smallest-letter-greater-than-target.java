class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int c=-1;
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                c=i;
                break;
            }
        }
        if(c==-1){
            return letters[0];
        }
        return letters[c];
    }
}