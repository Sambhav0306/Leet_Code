class Solution {
    public int maximumProduct(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(k!=0){
            int a=pq.poll();
            a=a+1;
            pq.add(a);
            k--;
        }
        long ans=1;
        while(pq.size()!=0){
            ans=(ans*pq.poll())%(int)(Math.pow(10,9)+7);
        }
      return (int)ans;
    }
}