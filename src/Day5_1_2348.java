public class Day5_1_2348 {
    public static void main(String[] args){
        int [] arr=new int[]{0,0,0,2,0,0};
        System.out.println(zeroFilledSubarray(arr));
    }
    static long zeroFilledSubarray(int[] nums) {
        long res = 0;
        for (int i = 0, j = 0; i < nums.length; ++i) {
            if (nums[i] != 0)
                j = i + 1;
            res += i - j + 1;
        }
        return res;
    }
}