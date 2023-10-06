class Solution {
    public int titleToNumber(String s) {
        int ans=0;
        int j=0;
        int i=s.length()-1;
        while(i>=0){
            int a=(int)(s.charAt(i)-'A')+1;
            int che=(int)Math.pow(26,j)*a;
            ans+=che;
            i--;
            j++;
        }
        return ans;
    }
}