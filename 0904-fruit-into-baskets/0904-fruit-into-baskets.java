class Solution {
    public int totalFruit(int[] nums) {
        int max=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        while(i<nums.length){
            if(map.size()<2){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],1);
                }else{
                    map.put(nums[i],map.get(nums[i])+1);
                }
                count++;
            }else if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                count++;
            }else{
                i--;
                max=Math.max(max,count);
                j=i-1;
                count=1;
                boolean flag=true;
                while(map.size()!=1 && i>=0) {
                    if (nums[i] == nums[j]) {
                        count++;
                        j--;
                        continue;
                    }
                    map.remove(nums[j]);
                    break;
                }
            }
            i++;
        }
        max=Math.max(count,max);
        return max;
    }
}