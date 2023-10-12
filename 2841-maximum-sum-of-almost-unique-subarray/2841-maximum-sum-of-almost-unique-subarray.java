class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long max=0;
        long sum=0;
        int i=0;
        for(int ind=0;ind<k;ind++){
            map.put(nums.get(ind),map.getOrDefault(nums.get(ind),0)+1);
            sum+=nums.get(ind);
            i=ind;
        }
        i++;
        if(map.size()>=m){
            max=Math.max(sum,max);
        }
        int j=0;
        while(i<nums.size()){
            if(map.get(nums.get(j))==1) map.remove(nums.get(j));
            else map.put(nums.get(j),map.get(nums.get(j))-1);
            sum-=nums.get(j);
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            sum+=nums.get(i);
            if(map.size()>=m){
            max=Math.max(sum,max);
            }
            i++;
            j++;
        }
        return max;
    }
}