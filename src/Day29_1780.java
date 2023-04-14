public class Day29_1780 {
    public static void main(String[] args) {
        int n=91;
        System.out.println(checkPowersOfThree(n));
    }
    static boolean checkPowersOfThree(int n) {
        int i=0;
        boolean a=true;
        while(a){
            int num=(int)Math.pow(3,i);
            if(n==num){
                return true;
            }
            if(num>n){
                a=false;
                break;
            }
            i++;
        }
        i=i-1;
        while(i>=0){
            int num=(int)Math.pow(3,i);
            if(n==0){
                return true;
            }
            if(n>=num){
                n=n-num;
                i--;
            }else{
                i--;
            }
        }
        if(n==0){
            return true;
        }
        return false;
    }
}
