class Solution {
    public int minSwaps(String s) {
        int zero = 0, one = 0, res = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && s.charAt(i) == '0') one++;
            if (i % 2 != 0 && s.charAt(i) == '1') zero++;
        }
        if (zero == 0 && one == 0) return 0;
        if (zero == one) res = one;
        zero = 0;
        one = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && s.charAt(i) == '1') zero++;
            if (i % 2 != 0 && s.charAt(i) == '0') one++;
        }
        if (zero == 0 && one == 0) return 0;
        if (zero == one) {
            if (res == -1) return one;
            else return Math.min(res, one);
        }
        return res;
    }
}