import java.util.*;g
public class Day1_2659 {
    long countOperationsToEmptyArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long ans=(long)nums.length;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(map.get(nums[i-1])>map.get(nums[i])){
                ans=ans+nums.length-i;
            }
        }
        return ans;
    }
}
