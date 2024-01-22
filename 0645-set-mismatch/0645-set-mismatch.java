class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            set.add(i);
        }
        int[] arr=new int[2];
        for(int i:nums){
            if(!set.contains(i)) arr[0]=i;
            set.remove(i);
        }
        for(int i:set){
            arr[1]=i;
        }
        return arr;
    }
}