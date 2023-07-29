class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder str=new StringBuilder(a);
        int count=1;
        while(count-1<=b.length()/a.length()+2){
            if(str.indexOf(b)>-1){
                return count;
            }else{
                str.append(a);
                count++;
            }
        }
        return -1;
    }
}