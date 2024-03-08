class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=Collections.max(map.values());
        int ans=0;
        for(int i:map.keySet()){
            if(map.get(i)==max) ans+=max;
        }
        return ans;
    }
}