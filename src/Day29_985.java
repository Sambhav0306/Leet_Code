import java.lang.reflect.Array;
import java.util.Arrays;

public class Day29_985 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        int[][] queries =new int[][]{
                {1,0},{-3,1},{-4,0},{2,3}
        };
        System.out.println(Arrays.toString(sumEvenAfterQueries(nums,queries)));

    }
    static int[] sumEvenAfterQueries(int[] nums, int[][] queries)
        {
            int arr[] = new int[nums.length];
            int sum = sumOfArray(nums);
            int i=0;
            for(int query[]:queries)
            {
                if(nums[query[1]]%2==0)
                    sum-=nums[query[1]];
                nums[query[1]]+=query[0];
                if(nums[query[1]]%2==0)
                    sum+=(nums[query[1]]);
                arr[i++]=sum;
            }
            return arr;
        }
        static int sumOfArray(int arr[])
        {
            int sum=0;
            for(int a:arr)
            {
                if(a%2==0)
                    sum+=a;
            }
            return sum;
        }
    }
