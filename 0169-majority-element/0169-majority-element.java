class Solution {
    public int majorityElement(int[] arr) {
        int max=arr.length/2;
        for(int i=0; i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                count++;
            }
            }
            if(count>=max&& count>arr.length/2){
                 return arr[i];
            }
            
        }
        return -1;
    }
}