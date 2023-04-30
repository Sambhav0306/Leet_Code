public class Day46_503 {
    int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int k=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    k=j;
                    break;
                }
            }
            int counter=0;
            while(k<nums2.length){
                if(nums2[k]>nums1[i]){
                    counter++;
                    arr[i]=nums2[k];
                    break;
                }
                k++;
            }
            if(counter==0){
                arr[i]=-1;
            }
        }
        return arr;
    }
}
