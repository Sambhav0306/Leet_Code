class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums=new int[1001];
        for(int i=0;i<arr1.length;i++){
            nums[arr1[i]]=nums[arr1[i]]+1;
        }
        int k=0;
        for(int i=0;i<arr2.length;i++){
            int ind=arr2[i];
            for(int j=0;j<nums[ind];j++){
                arr1[k]=ind;
                k++;
            }
            nums[ind]=0;
        }
        for(int i=0;i<1001;i++){
            for(int j=0;j<nums[i];j++){
                arr1[k]=i;
                k++;
            }
        }
        return arr1;
    }
}