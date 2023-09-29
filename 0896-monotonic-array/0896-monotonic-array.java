class Solution {
    public boolean isMonotonic(int[] arr) {
       int count1=0;
        int count2=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>arr[i-1]&& count1==0){
                count2++;
            }else if(arr[i]<arr[i-1]&& count2==0){
                count1++;
            } else if(count1==0 &count2==0) continue;
            else return false;
        }
        return true;
    }
}