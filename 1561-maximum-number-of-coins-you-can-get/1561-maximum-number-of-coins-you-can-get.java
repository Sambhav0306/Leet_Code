class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0;
        int j=piles.length-1;
        int count=0;
        while(j-1>i){
            count+=piles[j-1];
            j=j-2;
            i++;
        }
        return count;
    }
}