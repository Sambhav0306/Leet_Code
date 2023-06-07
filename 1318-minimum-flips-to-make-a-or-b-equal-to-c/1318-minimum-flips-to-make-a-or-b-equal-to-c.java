class Solution {
    public int minFlips(int a, int b, int c) {
        StringBuilder a1=bit(a);
        StringBuilder b1=bit(b);
        StringBuilder c1=bit(c);
        int count=0;
        int max=maxi(a1,b1,c1);
        while(a1.length()!=max){
            a1.insert(0,0);
        }
        while(b1.length()!=max){
            b1.insert(0,0);
        }
        while(c1.length()!=max){
            c1.insert(0,0);
        }
        
        for(int i=0;i<max;i++){
            if(c1.charAt(i)=='0'){
                if(a1.charAt(i)=='1'){
                    count++;
                }
                if(b1.charAt(i)=='1'){
                    count++;
                }
            }else{
                if(!(a1.charAt(i)=='1'|| b1.charAt(i)=='1')){
                    count++;
                }
            }
        }
        return count;
    }
    public StringBuilder bit(int n){
        StringBuilder str=new StringBuilder();
        while(n!=0){
            if(n%2==0){
                str.insert(0,'0');
            }else{
                str.insert(0,'1');
            }
            n=n/2;
        }
        return str;
    }
    public int maxi(StringBuilder a1,StringBuilder b1,StringBuilder c1){
        if(a1.length()>b1.length()){
            if(c1.length()>a1.length()){
                return c1.length();
            }else{
                return a1.length();
            }
        }else{
            if(c1.length()>b1.length()){
                return c1.length();
            }else{
                return b1.length();
            }
        }
    }
}