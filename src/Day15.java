import java.util.*;
public class Day15 {
    public static void main(String[] args) {
        int[] arr1=new int[]{9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr1)));
    }
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
