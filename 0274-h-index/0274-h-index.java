class Solution {
        public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h =0;
        for(int i=0;i<citations.length;i++){
            if(citations.length-i<=citations[i]){
            h=h+1;
            }
        }
       return h;
    }
}