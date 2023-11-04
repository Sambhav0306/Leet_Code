class Solution {
    public int monotoneIncreasingDigits(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0){
            list.add(0,n%10);
            n=n/10;
        }
        int[] nums=new int[list.size()];
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]>nums[i]){
                for(int j=i;j<nums.length;j++){
                    nums[j]=9;
                }
                nums[i-1]=nums[i-1]-1;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum*10+nums[i];
        }
        return sum;
    }
}