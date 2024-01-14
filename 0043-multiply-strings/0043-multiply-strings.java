class Solution {
    public String multiply(String num1, String num2) {
        String t="0";
        if(t.equals(num1)||t.equals(num2)) return t;
        String[] str=new String[num2.length()];
        int index=0;
        StringBuilder zero=new StringBuilder();
        for(int i=num2.length()-1;i>=0;i--){
            StringBuilder s=new StringBuilder();
            if(zero.length()!=0) s.append(zero);
            int a=num2.charAt(i)-'0';
            int count=0;
            for(int j=num1.length()-1;j>=0;j--){
                int b=num1.charAt(j)-'0';
                int mul=a*b+count;
                char app=(char)(mul%10+'0');
                count=mul/10;
                s.insert(0,app);
            }
            if(count!=0){
                char c=(char)(count+'0');
                s.insert(0,c);
            }
            zero.append('0');
            str[index++]=s.toString();
        }
        StringBuilder ans=new StringBuilder();
        int size=str[str.length-1].length();
        int k=1;
        int gc=0;
        while(k!=size+1){
            int add=0;
            for(int i=str.length-1;i>=0;i--){
                if(str[i].length()-k<0) continue;
                add+=str[i].charAt(str[i].length()-k)-'0';
            }
            add+=gc;
            char app=(char)(add%10+'0');
            gc=add/10;
            ans.insert(0,app);
            k++;
        }
        if(gc!=0){
            char ch=(char)(gc+'0');
            ans.insert(0,ch);
        }
        return ans.toString();
    }
}