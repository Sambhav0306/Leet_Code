class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        int count=1;
        int max=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(set.contains(a)&& set.contains(a+1)){
                if(set.contains(a-1)){
                    continue;
                }
                while(set.size()!=0 && set.contains(a+1)){
                    count++;
                    a=a+1;
                    set.remove(a);
                    max=Math.max(max,count);
                }
                count=1;
            }
        }
        return max;
    }
}