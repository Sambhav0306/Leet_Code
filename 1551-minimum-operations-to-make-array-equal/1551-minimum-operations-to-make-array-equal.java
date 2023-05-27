class Solution {
    public int minOperations(int n) {
        int target=n;
        int a=1;
        int count=0;
        while(a<n){
            count+=target-a;
            a=a+2;
        }
        return count;
    }
}