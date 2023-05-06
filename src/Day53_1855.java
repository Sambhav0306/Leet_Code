public class Day53_1855 {
    int maxDistance(int[] nums, int[] arr) {
        int max=0;
        int i=nums.length-1;
        int j=arr.length-1;
        while(i>=0 && j>=0){
            if(nums[i]<=arr[j]){
                if(j-i>max){
                    max=j-i;
                }
                i--;
            }else{
                j--;
            }
            if(j<i){
                while(i!=j){
                    i--;
                }
            }
        }
        return max;
    }
}
