class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='1') count++;
        }
        StringBuilder str=new StringBuilder();
        int zero=s.length()-count;
        while(count!=1) {
            str.append('1');
            count--;
        }
        while(zero!=0){
            str.append('0');
            zero--;
        }
        str.append('1');
        return str.toString();
    }
}