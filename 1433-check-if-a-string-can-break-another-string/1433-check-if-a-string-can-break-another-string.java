class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] nums1=s1.toCharArray();
        char[] nums2=s2.toCharArray();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int c1=0;
        int c2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>nums2[i] && c2!=0) {
                return false;
            }
            if(nums1[i]<nums2[i] &&c1!=0){
                return false;
            }
            if(nums1[i]>nums2[i]) c1++;
            else if(nums1[i]<nums2[i]) c2++;
        }
        return true;
    }
}