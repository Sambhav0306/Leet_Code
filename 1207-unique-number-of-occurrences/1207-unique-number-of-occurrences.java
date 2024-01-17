class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int[] nums=new int[map.size()];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                nums[j]=map.get(arr[i]);
                j++;
            }
        }
        nums[nums.length-1]=map.get(arr[arr.length-1]);
        for(int i=0;i<nums.length-1;i++){
            for(int k=i+1;k<nums.length;k++){
                if(nums[i]==nums[k]){
                    return false;
                }
            }
        }
        return true;
    }
}