class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long sum = 0;
        long check=0;
        long n1 = n;
        int count = 0;
        while (n1 != 0) {
            n1 /= 10;
            count++;
        }
        long[] arr = new long[count];
        n1 = n;
        int k = count - 1;
        while (n1 != 0) {
            long rem = n1 % 10;
            arr[k] = rem;
            k--;
            sum += rem;
            n1 /= 10;
        }
        long ans = 0;
        if (sum <= target) return 0;
        k = count - 1;
        while (true) {
            if (k < 0 || sum <= target) break;
            long a = 10 - arr[k];
            if(a==10){
                check++;
                k--;
                continue;
            }
            sum -= arr[k];
            if (k - 1 >= 0) arr[k - 1] = arr[k - 1] + 1;
            ans = ans * 10 + a;
            // ans=ans*10+a;
            sum++;
            k--;
        }
        long temp = 0;
        while (ans != 0) {
            long rem = ans % 10;
            temp = temp * 10 + rem;
            ans /= 10;
        }
        if(check==0) return temp;
        return temp*(long)(Math.pow(10,check));
    }
}