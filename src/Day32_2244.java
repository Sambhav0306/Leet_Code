import java.util.*;
public class Day32_2244 {
    public static void main(String[] args){
        int [] arr=new int[]{9,9,11,9,22,22,11,552,22,22,55};
        System.out.println(minimumRounds(arr));
    }
    static int minimumRounds(int[] task) {
        Arrays.sort(task);
        int count=0;
        int j=1;
        for(int i=0;i<task.length;i++){
            j=i+1;
            int counter=1;
            while(j<task.length && task[i]==task[j]){
                j++;
                counter++;
            }
            if(counter==1){
                return -1;
            }
            while(counter!=0){
                if(counter%3==0){
                    count++;
                    counter=counter-3;
                }else{
                    count++;
                    counter=counter-2;
                }
            }
            i=j-1;
        }
        return count;
    }
}
