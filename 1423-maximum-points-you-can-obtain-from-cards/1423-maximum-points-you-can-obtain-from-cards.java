class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int total=0;
        for(int i=0;i<k;i++){
            total+=cardPoints[i];
        }
        int best=total;
        int j=n-1;
        for(int i=k-1;i>=0;i--){
            total+=cardPoints[j]-cardPoints[i];
            best=Math.max(best,total);
            j--;
        }
        return best;
    }
}