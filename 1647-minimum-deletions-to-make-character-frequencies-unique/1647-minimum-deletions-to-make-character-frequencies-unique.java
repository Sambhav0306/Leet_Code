class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        int[] nums=new int[map.size()];
        int a=0;
        for(char ch:map.keySet()){
            nums[a]=map.get(ch);
            a++;
        }
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==0) continue;
            for(int j=1;j<=i;j++){
                if(nums[i]==nums[i-j]){
                    nums[i-j]=nums[i-j]-1;
                    count++;
                }
            }
        }
        return count;
    }
}