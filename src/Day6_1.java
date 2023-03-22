import java.util.Arrays;
import java.util.LinkedList;

public class Day6_1 {
    public static void main(String[] args){
        int[] arr=new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    static int[] twoSum(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=nums.length-1;j>i;j--){
                sum=nums[i]+nums[j];
                if(target==sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}