class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long sum=0;
        for(int i=0;i<shifts.length;i++){
            sum=sum+shifts[i];
        }
        int n=shifts.length;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<shifts.length;i++){
            long add=sum%26;
            long num=s.charAt(i)-'a';
            long a=(add+num)%26;
            char ch=(char)(a+'a');
            str.append(ch);
            sum-=shifts[i];
        }
        String st=str.toString();
        return st;
    }
}