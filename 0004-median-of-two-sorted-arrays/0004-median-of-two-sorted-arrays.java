class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int a=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                nums[a]=nums1[i];
                i++;
            }else{
                nums[a]=nums2[j];
                j++;
            }
            a++;
        }
        while(i<nums1.length){
            nums[a]=nums1[i];
            i++;
            a++;
        }
        while(j<nums2.length){
            nums[a]=nums2[j];
            j++;
            a++;
        }
        double ans=0;
        if(nums.length%2==0){
            ans=(double)(nums[(nums.length-1)/2]+nums[nums.length/2]);
            ans=ans/2.0;
        }else{
            ans=(double)nums[nums.length/2];
        }
        return ans;
    }
}