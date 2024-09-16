class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(nums[i].length()+nums[j].length()==target.length()){
                        StringBuilder str=new StringBuilder(nums[i]);
                        str.append(nums[j]);
                        if(str.toString().equals(target)) count++;
                        StringBuilder str1=new StringBuilder(nums[j]);
                        str1.append(nums[i]);
                        if(str1.toString().equals(target)) count++;  
                    }
            }
        }
        return count;
    }
}