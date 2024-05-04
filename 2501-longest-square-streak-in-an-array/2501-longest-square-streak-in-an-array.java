class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int i=0;
        int max=0;
        int count=0;
        while(i<nums.length){
            int mid=nums[i];
            if(!set.contains(nums[i])){
                i++;
                continue;
            }
            if(set.size()==0) break;
            while(set.size()!=0 && i<nums.length){
                if(!set.contains(nums[i]) && !set.contains(mid)){
                    max=Math.max(count,max);
                    count=0;
                    i++;
                    break;
                }else{
                    set.remove(mid);
                    mid=mid*mid;
                    count++;
                }
            }
            max=Math.max(count,max);
            count=0;
        }
        if(max==1 ||max==0) return -1;
        return max;
    }
}