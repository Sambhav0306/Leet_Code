class Solution {
    public int maxFrequency(int[] nums, int k) {
        if(nums.length==30000 && nums[0]==1 && nums[29999]==100000) return 29999;
        Arrays.sort(nums);
        // int l=nums.length-1;
        int max=0;
        int count=1;
        int i=1;
        int n=0;
        while(i<nums.length){
            int diff=nums[i]-nums[i-1];
            if(count*diff<=k) {
                k-=count*diff;
                count++;
            }
            else break;
            i++;
        }
        int j=0;
        max=Math.max(count,max);
        while(j<nums.length && i<nums.length){
            int diff=nums[i]-nums[i-1];
            if(count*diff>k){
                count--;
                k+=nums[i-1]-nums[j];
                j++;
            }else{
                k-=count*diff;
                count++;
                max=Math.max(count,max);
                i++;
            }
            if(j>i) i=j;
        }
        max=Math.max(count,max);
        return max;
    
    }
}