class Solution {
    public int maxSatisfied(int[] nums, int[] arr, int minutes) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(arr[i]==0) count+=nums[i];
        }
        int j=0;
        int k=0;
        while(j<nums.length && j!=minutes){
            if(arr[j]==1) count+=nums[j];
            j++;
        }
        max=Math.max(count,max);
        while(j!=nums.length){
            if(arr[k]==1) count-=nums[k];
            if(arr[j]==1) count+=nums[j];
            j++;
            k++;
            max=Math.max(count,max);
        }
        return max;
    }
}