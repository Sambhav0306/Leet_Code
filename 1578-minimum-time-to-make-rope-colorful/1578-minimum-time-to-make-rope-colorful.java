class Solution {
    public int minCost(String s, int[] arr) {
        int sum=0;
        int i=0;
        int j=1;
        while(i<arr.length){
            if(j<arr.length && s.charAt(i)==s.charAt(j)){
                if(arr[i]<=arr[j]){
                    sum+=arr[i];
                    i=j;
                    j++;
                }else{
                    sum+=arr[j];
                    j++;
                }
            }else{
                i=j;
                j=i+1;
            }
        }
        return sum;
    }
}