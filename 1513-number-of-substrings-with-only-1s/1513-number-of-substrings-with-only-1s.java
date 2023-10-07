class Solution {
    public int numSub(String s) {
           int count = 0 , ones = 0;
           for(int i = 0; i < s.length(); i++){
               while(i < s.length() && s.charAt(i)=='1'){
                   ones++;
                   count= (count%(1000000007))+ones;
                   i++;
               }
               ones=0;
    }
return count;
}
}