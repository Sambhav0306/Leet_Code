class Solution {
    public int arrangeCoins(int n) {
      int i=1;
      int add=1;
      while(n-add>=0){
          i++;
          // if(n-add==0) return i;
          add=add+i;
      }
        return i-1;
    }
}