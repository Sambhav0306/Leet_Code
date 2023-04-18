import java.util.*;
public class Day32_2244 {
    public static void main(String[] args){
        int [] arr=new int[]{3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(arr));
    }
    static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i+1]=nums[i+1]+1;
                count++;
            }
        }
        return count;
    }
}
