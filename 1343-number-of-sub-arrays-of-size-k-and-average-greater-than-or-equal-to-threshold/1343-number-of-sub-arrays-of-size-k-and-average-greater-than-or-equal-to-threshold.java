class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        int i=0;
        int j=0;
        while(j<arr.length && j!=k){
            sum+=arr[j];
            j++;
        }
        while(j<arr.length){
            if(sum/k>=threshold) count++;
            sum-=arr[i];
            sum+=arr[j];
            i++;
            j++;
        }
        if(sum/k>=threshold) count++;
        return count;
    }
}