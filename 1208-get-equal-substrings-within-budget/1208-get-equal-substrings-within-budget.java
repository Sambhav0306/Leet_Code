class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0;
        int j=0;
        int count=0;
        int maxCount=0;
        while(true){
            if(i<=s.length()) break;
            int mid=Math.abs(s.charAt(i)-t.charAt(i));
            if(mid>maxCost) break;
            maxCost-=mid;
            count++;
            i++;
        }
        maxCount=Math.max(count,maxCount);
        while(i<s.length() && j<s.length()){
            int mid=Math.abs(s.charAt(i)-t.charAt(i));
            if(mid>maxCost){
                maxCost+=Math.abs(s.charAt(j)-t.charAt(j));
                j++;
                count--;
            }
            if(maxCost>=mid){
                maxCost-=mid;
                count++;
                maxCount=Math.max(count,maxCount);
                i++;
            }
            if(j>i){
                i=j;
            }
        }
        return maxCount;
    }
}