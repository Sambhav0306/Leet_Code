class Solution {
    public String reverseWords(String s) {
        char[] nums=s.toCharArray();
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=' '){
                j++;
                continue;
            }
            int k=j;
            j--;
            while(i<j){
                char temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            k++;
            i=k;
            j=k;
        }
        j--;
        while(i<j){
                char temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
        }
        String str=new String(nums);
        return str;
    }
}