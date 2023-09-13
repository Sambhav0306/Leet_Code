class Solution {
    public int longestContinuousSubstring(String s) {
        int max=1;
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            int a=s.charAt(i);
            int b=s.charAt(i+1);
            if(a+1==b){
                count++;
            }else{
                max=Math.max(max,count);
                count=1;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}