class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<logs.length;i++){
            if(!map.containsKey(logs[i][0])){
                HashSet<Integer> set=new HashSet<>();
                set.add(logs[i][1]);
                map.put(logs[i][0],set);
            }else{
                HashSet<Integer> set=map.get(logs[i][0]);
                set.add(logs[i][1]);
                map.put(logs[i][0],set);
            }
        }
        int[] nums=new int[k];
        for(int i:map.keySet()){
            HashSet<Integer> set=map.get(i);
            int s=set.size();
            nums[s-1]++;
        }
        return nums;
    }
}