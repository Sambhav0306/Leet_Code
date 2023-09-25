class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        int sum=0;
        int i=0;
        int j=0;
        while(i<nums.length){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                sum+=nums[i];
            }else{
                max=Math.max(sum,max);
                while(nums[j]!=nums[i]){
                    sum-=nums[j];
                    set.remove(nums[j]);
                    j++;
                }
                 // sum-=nums[j];
                 j++;
            }
            i++;
        }
        max=Math.max(sum,max);
        return max;
    }
}