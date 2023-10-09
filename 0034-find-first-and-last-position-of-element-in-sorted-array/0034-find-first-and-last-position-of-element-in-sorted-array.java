class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1;
        int end=-1;
        start=start(nums,target);
        end=end(nums,target);
        int[] arr={start,end};
        return arr;
    }
    public int start(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int end(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}