class Solution {
    public String convertToTitle(int col) {
        StringBuilder str=new StringBuilder();
        while(col!=0){
            int rem=col%26;
            if(col==26){
                str.append('Z');
                break;
            }
            char c='a';
            if(rem!=0){
            c=(char)(rem-1+'A');
            }else{
                c='Z';
                col--;
            }
            str.append(c);
            col=col/26;
        }
        str.reverse();
        return str.toString();
    }
}