class Solution {
    public int missingNumber(int[] arr) {
         int i=0;
        while (i<arr.length){
            int n= arr[i];
            if (arr[i]< arr.length&&arr[n]!=arr[i]){
                swap(arr,n,i);
            }else {
            i++;
            }
        }
        for (int k=0;k<arr.length;k++){
            if (arr[k]!=k) {
                return k;
            }
        }
        return arr.length;
    }
    static void swap(int[]arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    }