public class Day2_829 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(consecutiveNumbersSum(n));
    }

    static int consecutiveNumbersSum(int N) {

            int ans=0;

            for(int k=1;k*k<2*N;k++){

                if((N-k*(k-1)/2)%k==0) ans++;
            }
            return ans;
        }
    }