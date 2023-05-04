public class Day52_74 {
    boolean searchMatrix(int[][] arr, int target) {
        int row=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i][arr[0].length-1] >= target) {
                row = i;
                break;
            }
        }
        int start=0;
        int end=arr[row].length-1;
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if (arr[row][mid]==target){
                return true;
            }
            if (arr[row][mid]<target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return false;
    }
}
