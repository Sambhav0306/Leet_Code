class Solution {
    public int myAtoi(String s) {
        double ans=0;
        int sign=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                if(sign!=0) return (int)(sign*ans);
//                if(ans>Math.pow(2,31)-1) return (int)Math.pow(2,31)-1;
                return (int)ans;
            }
            if(s.charAt(i)==' ' && count==0){
                continue;
            }else if (s.charAt(i)==' ' && count>0){
                if(sign!=0) return (int)(sign*ans);
//                if(ans>Math.pow(2,31)-1) return (int)Math.pow(2,31)-1;
                return (int)ans;
            }
            if(s.charAt(i)=='-' && sign==0){
                count++;
                sign=-1;
            }else if(s.charAt(i)=='+' && sign==0){
                count++;
                sign=1;
            }else if(sign!=0 && s.charAt(i)=='+' || s.charAt(i)=='-' ){
                if(sign!=0) return (int)(sign*ans);
//                if(ans>Math.pow(2,31)-1) return (int)Math.pow(2,31)-1;
                return (int)ans;
            }
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                if(sign!=0) return (int)(sign*ans);
//                if(ans>Math.pow(2,31)-1) return (int)Math.pow(2,31)-1;
                return (int)ans;
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                if(sign!=0) return (int)(sign*ans);
//                if(ans>Math.pow(2,31)-1) return (int)Math.pow(2,31)-1;
                return (int)ans;
            }
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    if(ans>Math.pow(2,31)){
                        if(sign>=0){
                            return (int)Math.pow(2,31);
                        }else{
                            return sign*(int)Math.pow(2,31)-1;
                        }
                    }
                    ans=ans*10+(int)(s.charAt(i)-'0');
                    i++;
                    count++;
                }
//                if(ans>Math.pow(2,31)-1) return (int)Math.pow(2,31)-1;
                if(sign!=0) return (int)(sign*ans);
                return (int)ans;
            }
        }
        if(sign!=0) return (int)(sign*ans);
        return (int)ans;
    }
}