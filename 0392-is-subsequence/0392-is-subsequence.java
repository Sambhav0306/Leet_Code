class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()){
            return false;
        }
        int a=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=a;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    count++;
                    a=j+1;
                    break;
                }
            }
            if(count==0){
                return false;
            }
        }
        return true;
    }
}