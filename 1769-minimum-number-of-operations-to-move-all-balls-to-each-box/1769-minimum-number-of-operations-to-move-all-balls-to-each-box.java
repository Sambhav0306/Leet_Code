class Solution {
    public int[] minOperations(String s) {
        int[] arr=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if(s.charAt(j)=='1'){
                 sum+=Math.abs(j-i);   
                }
            }
            arr[i]=sum;
        }
        return arr;
    }
}