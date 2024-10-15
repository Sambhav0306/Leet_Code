class Solution {
    public long minimumSteps(String s) {
        long count=0;
        int i=s.length()-1;
        int j=s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='1'){
                if(i==j){
                    j--;
                    i--;
                }else{
                    count+=j-i;
                    j--;
                    i--;
                }
            }else{
                i--;
            }
        }
        return count;
    }
}