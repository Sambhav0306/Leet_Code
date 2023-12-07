class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        StringBuilder str=new StringBuilder();
        while(i>=0){
            int a=num.charAt(i)-'0';
            if(a%2==1) break;
            i--;
        }
        while(i>=0){
            str.append(num.charAt(i));
            i--;
        }
        str.reverse();
        return str.toString();
    }
}