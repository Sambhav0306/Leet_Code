class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k){
            return "0";
        }
        int a=k;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<num.length();i++){
            if(a==0){
                while(i<num.length()){
                    s.push(num.charAt(i));
                    i++;
                }
                break;
            }
            if(!s.isEmpty() && s.peek()>num.charAt(i)){
                while(!s.isEmpty() && s.peek()>num.charAt(i)){
                    if(a==0){
                        break;
                    }
                    s.pop();
                     a--;   
                }           
            }
            s.push(num.charAt(i));
        }
        while( s.size()!=num.length()-k){
            s.pop();
        }
        StringBuilder str=new StringBuilder();
        while(s.size()!=0){
            str.append(s.pop());
        }
        str.reverse();
        while(true){
            if(str.length()!=0 && str.charAt(0)=='0'){
                str.deleteCharAt(0);
            }else{
                break;
            }
        }
        if(str.length()==0){
            return "0";
        }
        return str.toString();
    }
}
