public class Day41_258 {
    public static int addDigits(int n) {
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return ans(sum);
    }
    public static int ans(int sum){
        if(sum<10){
            return sum;
        }
        int a=0;
        while(sum!=0){
            int rem=sum%10;
            a+=rem;
            sum=sum/10;
        }
        return ans(a);
    }
}
