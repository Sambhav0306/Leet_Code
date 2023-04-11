import java.util.Arrays;
public class Day26_2592 {
    static int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
            return 0;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[count]){
                count++;
            }
        }
        return count;
    }
}
