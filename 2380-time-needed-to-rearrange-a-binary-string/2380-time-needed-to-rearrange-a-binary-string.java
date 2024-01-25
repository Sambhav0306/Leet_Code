class Solution {
    public int secondsToRemoveOccurrences(String s) {
        char[] nums=s.toCharArray();
        int count=0;
        while(true){
            boolean bool=true;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]=='0' && nums[i+1]=='1'){
                    char temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                    i++;
                    bool=false;
                }
            }
            if(bool) break;
            count++;
        }
        return count;
    }
}