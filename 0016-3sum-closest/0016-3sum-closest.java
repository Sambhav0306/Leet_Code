class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            while(j<nums.length-1){
                int k=j+1;
                while(k<nums.length){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(target-sum)<Math.abs(target-min)){
                        min=sum;
                    }
                    k++;
                }
                j++;
            }
        }
        return min;
    }
}