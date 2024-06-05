class Solution {
    public String countAndSay(int n) {
        StringBuilder str=new StringBuilder("1");
        n--;
        while(n!=0){
            int j=0;
            StringBuilder s=new StringBuilder();
            while(j<str.length()){
                int count=0;
                char c=str.charAt(j);
                while(j<str.length() && str.charAt(j)==c){
                    count++;
                    j++;
                }
                // str.delete(i,j);
                while(count!=0){
                    int rem=count%10;
                    count/=10;
                    char ch=(char)(rem+'0');
                    s.append(ch);
                }
                s.append(c);
            }
            str=new StringBuilder(s);
            n--;
        }
        return str.toString();
    }
}