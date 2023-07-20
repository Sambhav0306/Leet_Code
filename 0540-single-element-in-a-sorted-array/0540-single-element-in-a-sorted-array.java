class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0, high=nums.length-1, n = nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-2]!=nums[n-1]) return nums[n-1];
        low= 1;
        high = n-2;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
{
    return nums[mid];
}
        //even
            if(mid%2==0)
            {
                if(nums[mid]==nums[mid+1])
                {
                    low = mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        //odd
            else
            {
                if(nums[mid]==nums[mid-1])
                {
                    low = mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}