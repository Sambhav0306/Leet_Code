class Solution {
    public int removeElement(int[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
                arr[i]=-1;
            }
        }
            Arrays.sort(arr);
            for(int i=0;i<arr.length/2;i++){
                if(arr[arr.length-1-i]==-1){
                    break;
                }
                int temp=arr[i];
                arr[i]=arr[arr.length -1-i];
                arr[arr.length -1-i]=temp;
                
            }
        return arr.length-count;
    }
}