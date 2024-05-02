class Solution {
    public int findMaxK(int[] nums) {
     Arrays.sort(nums);
     HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<0) return -1;
            if(set.contains(-nums[i])) return nums[i];
        }
        return -1;
    }
}