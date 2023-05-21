class Solution {
    public int findUnsortedSubarray(int[] nums) {
       int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(nums);
        int count1=-1;
        int count2=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if( count1==-1 && nums[i]!=arr[i]){
                count1=i;

            }
            if(count2==-1 && nums[j]!=arr[j]){
                count2=j;
            }
            i++;
            j--;
        }

        if(count1==count2){
            return 0;
        }
        int c2=0;
        if(count1==-1){
            while(j<nums.length){
                if(nums[j]!=arr[j]){
                    c2=j;
                    return count2-j+1;
                }
                j++;
            }
        }
        int c1=0;
        if(count2==-1){
            while(i>=0){
                if(nums[i]!=arr[i]){
                    c1=i;
                    return c1-count1+1;
                }
                i--;
            }
        }
        return count2-count1+1;

    }
}