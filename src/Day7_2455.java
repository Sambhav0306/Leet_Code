//Question 2455 https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
public class Day7_2455 {
    public static void main(String[] args){
        int [] arr=new int[]{1,6,5};
        System.out.println(averageValue(arr));
    }
    static int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                sum=sum+nums[i];
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
    }
}
