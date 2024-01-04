class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==1) return -1;
            int a=map.get(i);
            if(a%3==0){
                count+=a/3;
            }else if(a%3==1){
                count+=a/3+1;
            }else{
                count+=a/3+1;
            }
        }
        return count;
    }
}