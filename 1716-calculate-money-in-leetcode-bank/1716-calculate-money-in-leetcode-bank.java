class Solution {
    public int totalMoney(int n) {
     int count=0;
    int i=0;
        int a=1;
        while(i<n){
            int j=0;
            int o=a;
            while(i<n && j!=7){
                count+=o;
                o++;
                i++;
                j++;
            }
            a++;
        }
        return count;
    }
}