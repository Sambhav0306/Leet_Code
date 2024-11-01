class Solution {
    public String makeFancyString(String s) {
        StringBuilder str=new StringBuilder(s);
        int size=str.length()-1;
        int i=1;
        while(i<size){
            if(i<size && str.charAt(i)==str.charAt(i+1)  && str.charAt(i)==str.charAt(i-1)){
                str.deleteCharAt(i);
                size--;
            }else{
                i++;
            }
        }
        return str.toString();
    }
}