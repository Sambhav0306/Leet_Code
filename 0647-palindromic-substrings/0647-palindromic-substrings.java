class Solution {
    public int countSubstrings(String s) {
      int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(f(i,j,s)) count++;
            }
        }
        return count;
    }
    public boolean f(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}