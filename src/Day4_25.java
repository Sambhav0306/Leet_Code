import java.util.Arrays;
public class Day4_25 {
    public static void main(String[] args){
        int[] arr=new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(answer(arr,0)));
    }
    static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==101|| nums[i]!=nums[j]){
                    break;
                }
                if(nums[i]==nums[j]){
                    nums[j]=101;
                }
            }
        }
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==101){
                break;
            }
            count++;
        }
        return count++;
    }
    static int[] answer(int[] nums,int count){
        count=removeDuplicates(nums);
        int[] arr=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=nums[i];
        }
        return arr;
    }
}