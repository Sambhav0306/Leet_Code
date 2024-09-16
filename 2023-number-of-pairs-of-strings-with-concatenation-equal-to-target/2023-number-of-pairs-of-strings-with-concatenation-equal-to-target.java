class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                    if(i!=j && nums[i].length()+nums[j].length()==target.length()){
                        StringBuilder str=new StringBuilder(nums[i]);
                        str.append(nums[j]);
                        if(str.toString().equals(target)) count++;
                    }
            }
        }
        return count;
    }
}