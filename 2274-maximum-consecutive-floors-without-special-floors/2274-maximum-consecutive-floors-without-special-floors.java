class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int max=0;
        Arrays.sort(special);
        int a=bottom;
        for(int i=0;i<special.length;i++){
            max=Math.max(max,special[i]-a);
            a=special[i]+1;
        }
        if(a>top) return max;
        max=Math.max(max,top-a+1);
        return max;
    }
}