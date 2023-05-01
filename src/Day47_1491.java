import java.util.Arrays;
public class Day47_1491 {
    double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for(int j=1;j<salary.length-1;j++){
            sum+=salary[j];
        }
        return sum/(salary.length-2);
    }
}
