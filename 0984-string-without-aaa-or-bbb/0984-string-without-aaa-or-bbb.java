class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder str=new StringBuilder();
        if(a==b){
            while(a!=0){
                str.append('a');
                str.append('b');
                a--;
            }
            return str.toString();
        }
        if(a>b){
            while(a-2>b){
                str.append('a');
                str.append('a');
                str.append('b');
                a-=2;
                b--;
            }
            while(b!=0){
                str.append('a');
                str.append('b');
                a--;
                b--;
            }
            while(a!=0){
                str.append('a');
                a--;
            }
        }else{
            while(b-2>a){
                str.append('b');
                str.append('b');
                str.append('a');
                b-=2;
                a--;
            }
            while(a!=0){
                str.append('b');
                str.append('a');
                a--;
                b--;
            }
            while(b!=0){
                str.append('b');
                b--;
            }
        }
        return str.toString();
    }
}