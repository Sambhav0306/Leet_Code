class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] nums=new int[dist.length];
        for(int i=0;i<nums.length;i++){
            int in=0;
            if(dist[i]%speed[i]!=0) in=dist[i]/speed[i]+1;
            else in=dist[i]/speed[i];
            nums[i]=in;
        }
        Arrays.sort(nums);
        int count=0;
        int minus=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-minus<=0) return count;
            count++;
            minus++;
        }
        return count;
    }
}