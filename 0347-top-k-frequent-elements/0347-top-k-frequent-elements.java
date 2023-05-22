class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[k];
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.replace(nums[i],map.get(nums[i])+1);
            }
        }
        while(k!=0){
            int val=Collections.max((map.values()));
             for (Map.Entry<Integer, Integer> entry :
             map.entrySet()) {
            if (entry.getValue() == val) {
                arr[k-1]=entry.getKey();
                map.remove(arr[k-1]);
                break;
            }
        }
        k--;
        }
        return arr;
    }
}