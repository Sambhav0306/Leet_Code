class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) continue;
            int rem=k-nums[i];
            if(map.containsKey(rem)){
                if(nums[i]==rem && map.get(rem)<2) continue;
                count++;
                map.put(rem,map.get(rem)-1);
                if(map.get(rem)==0) map.remove(rem);
            }
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) map.remove(nums[i]);
            }
        }
        return count;
    }
}