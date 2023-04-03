import java.util.*;
public class Day18_462 {
    int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length/2;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count+Math.abs(nums[a]-nums[i]);
        }
        return count;
    }
}
