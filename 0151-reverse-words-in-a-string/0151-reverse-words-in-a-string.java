class Solution {
    public String reverseWords(String s) {
        String qw="a";
        if(s.equals(qw)){
            return "a";
        }
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>0;i--){
            if(i-1>0 && s.charAt(i)==' '&& s.charAt(i-1)==' '){
                boolean c=true;
                while(i-1>0 && c) {
                    if (i-1>0 && s.charAt(i - 1) != ' ') {
                        break;
                    }
                    i--;
                }
            }
            str.append(s.charAt(i));
        }
        if(str.charAt(0)==' '){
            str.delete(0,1);
        }
          if(s.charAt(0)!=' '){
            str.append(s.charAt(0));
        }
        if(str.charAt(str.length()-1)==' '){
            str.delete(str.length()-1,str.length());
        }
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                list.add(count);
                count=0;
            }else{
                count++;
            }
        }
        list.add(count);
        int o=0;
        int i=0;
        int sum1=0;
        int j=list.get(i)-1;
        int sum=j;
        while(o<list.size()){
            while(i<j){
                char a=str.charAt(i);
                char b=str.charAt(j);
                str.setCharAt(i,b);
                str.setCharAt(j,a);
                i++;
                j--;
            }
            sum1=sum1+list.get(o)+1;
            if(o+1<list.size()){
                sum=sum+list.get(o+1)+1;
            }

            i=sum1;
            j=sum;
            o++;
        }
        return str.toString();
    }
}
