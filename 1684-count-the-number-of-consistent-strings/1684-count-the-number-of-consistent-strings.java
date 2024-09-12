class Solution {
    public int countConsistentStrings(String s, String[] nums) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            boolean check=true;
            for(int j=0;j<nums[i].length();j++){
                if(!set.contains(nums[i].charAt(j))) {
                    check=false;
                    break;
                }
            }
            if(check) count++;
        }
        return count;
    }
}