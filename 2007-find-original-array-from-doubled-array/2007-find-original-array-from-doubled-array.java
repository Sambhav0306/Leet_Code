class Solution {
    public  int[] findOriginalArray(int[] nums) {
               Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] re=new int[0];
        int[] arr=new int[nums.length/2];
        int i=0;
        if(nums.length%2!=0){
            return re;
        }
        int count=0;
        while(i<nums.length && nums[i]==0){
            count++;
            i++;
        }
        if(count%2!=0){
            return re;
        }
        count=count/2;
        int j=i;
        while(i<nums.length){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            i++;
        }
        while(j<nums.length){
            if(!map.containsKey(nums[j])){
                j++;
                continue;

            }
            else if(map.containsKey(nums[j]*2)){
                map.put(nums[j]*2,map.get(nums[j]*2)-1);
                map.put(nums[j],map.get(nums[j])-1);
                arr[count]=nums[j];
                count++;
            }else{
                return new int[0];
            }
            if(map.get(nums[j]*2)==0) {
                map.remove(nums[j] * 2);
            }
            if(map.get(nums[j])==0) {
                map.remove(nums[j]);
            }
            j++;
        }
        return arr;
    }
}
