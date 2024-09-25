class Solution {
    public int countDays(int days, int[][] arr) {
        int count=0;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int i=0;
        int curr=0;
        while(i<arr.length){
            if(i==0){
                if(arr[0][0]>1) count+=arr[0][0]-1;
                 curr=arr[0][1];
                i++;
            }else{
                if(curr<arr[i][0]){
                    count+=arr[i][0]-curr-1;
                }
                if(curr<arr[i][1]) curr=arr[i][1];
                i++;
            }
        }
        if(curr<days){
            count+=days-curr;
        }
        return count;
    }
}