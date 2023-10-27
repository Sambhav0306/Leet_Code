class Solution {
    public String longestPalindrome(String s) {
        int maxi=0;
        int maxj=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(f(i,j,s)){
                    if(max<j-i+1){
                        max=j-i+1;
                        maxi=i;
                        maxj=j;
                    }
                }
            }
            
        }
        StringBuilder str=new StringBuilder();
            for(int i=maxi;i<=maxj;i++){
                str.append(s.charAt(i));
            }
        return str.toString();
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