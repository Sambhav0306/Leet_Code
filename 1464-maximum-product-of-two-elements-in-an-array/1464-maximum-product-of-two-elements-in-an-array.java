class Solution {
    public int maxProduct(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
          for (int j=i+1;j>0;j--){
              if (arr[j]<arr[j-1]){
                  swap(arr,j,j-1);

              }else {
                  break;
              }
          }
      }
        int ans=(arr[arr.length-1]-1)*(arr[arr.length-2]-1);
        return ans;
    }
    public void swap(int[]arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}