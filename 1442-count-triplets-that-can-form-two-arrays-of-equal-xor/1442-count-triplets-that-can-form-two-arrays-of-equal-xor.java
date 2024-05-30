class Solution {
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            for(int j=i+1;j<arr.length;j++){
                int b=0;
                for(int k=j;k<arr.length;k++){
                    b=b^arr[k];
                    if(a==b) count++;
                }
                a=a^arr[j];
            }
        }
        return count;
    }
}