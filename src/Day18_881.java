import java.util.*;
public class Day18_881 {
    static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int count=0;
        int j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                count++;
                i++;
                j--;
            }else{
                count++;
                j--;
            }
        }
        return count;
    }
}
