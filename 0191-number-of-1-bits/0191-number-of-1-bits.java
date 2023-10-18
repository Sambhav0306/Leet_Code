public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    long x = 1L << 31; int cnt = 0;
    if((n & x) != 0) {
      while((n & x) != 0) {
        x >>>= 1;
        cnt++;
      }
    } else {
      while((n & x) == 0 && x > 0) {
        x >>>= 1;
      }
    }
    return cnt + getOnesCount(n, x);
  }

  public int getOnesCount(int n, long x) {
    int cnt = 0;
    while(x > 0) {
      if((n & x) != 0) {
        cnt++;
      }
      x >>>= 1;
    }
    return cnt;
  }
}