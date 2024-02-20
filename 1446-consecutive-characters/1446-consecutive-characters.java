class Solution {
    public int maxPower(String s) {
        int max=0;
        int count=0;
        char ch=s.charAt(0);
        for(char c:s.toCharArray()){
            if(ch==c) count++;
            else{
                max=Math.max(count,max);
                count=1;
                ch=c;
            }
        }
        max=Math.max(count,max);
        return max;
    }
}