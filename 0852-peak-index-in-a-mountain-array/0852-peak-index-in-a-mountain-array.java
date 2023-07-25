class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(mid==0){
                mid=mid+1;
            }
            if(mid==arr.length-1){
                mid=mid-1;
            }
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                end=mid-1;
            }
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return -1;
    }
}