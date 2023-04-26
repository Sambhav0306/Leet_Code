public class Day41_7 {
    public static void main(String[] args) {
        int x=-321;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        int a=x;
        int n=0;
        while(a!=0){
            int rem=a%10;
            if(rem!=0){
                n=n*10+rem;
            }
            a=a/10;
        }
        if(x<0){
            return n;
        }
        return n;
    }
}
