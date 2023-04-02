import java.util.*;
public class Day16_739 {
    public static void main(String[] args) {
        int[] arr=new int[]{73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    static int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                    nums[stack.peek()]=i-stack.peek();
                    stack.pop();
                }
            }
            stack.push(i);
        }

        return nums;
}
}
