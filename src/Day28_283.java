import java.util.Arrays;

public class Day28_283 {
    public static void main(String[] args) {
        int[] nums=new int[]{4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);
    }
    static void moveZeroes(int[] nums) {
        if(nums.length==1){
            return;
        }
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]!=0){
                i++;
                j++;
            }else if(j<nums.length && nums[i]==0 &&nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
