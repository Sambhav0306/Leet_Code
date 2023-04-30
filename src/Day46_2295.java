import java.util.*;
public class Day46_2295 {
    int[] arrayChange(int[] nums, int[][] ope) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<ope.length;i++){
            nums[map.get(ope[i][0])]=ope[i][1];
            map.put(ope[i][1],map.get(ope[i][0]));
            map.remove(ope[i][0]);
        }
        return nums;
    }
}
