class Solution {
    StringBuilder str=new StringBuilder("0");
    public char findKthBit(int n, int k) {
        f(n);
        return str.charAt(k-1);
    }
    public void f(int n){
        if(n==0) return;
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0') str1.append('1');
            else str1.append('0');
        }
        str.append('1');
        str.append(str1.reverse());
        // System.out.println(str);
        f(n-1);
        return;
    }
}