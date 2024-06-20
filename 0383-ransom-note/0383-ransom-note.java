class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] nums1=ransomNote.toCharArray();
        char[] nums2=magazine.toCharArray();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i==nums1.length) return true;
        return false;
    }
}