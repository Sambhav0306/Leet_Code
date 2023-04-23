import java.util.*;
public class Day38_2640 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,3,7,5,10};
        System.out.println(Arrays.toString(findPrefixScore(nums)));
    }
    static long[] findPrefixScore(int[] nums) {
        long[] arr=new long[nums.length];
        long sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
            long a=(int)nums[i]+(int)nums[max];
            sum=sum+a;
            arr[i]=sum;
        }
        return arr;
    }
}
