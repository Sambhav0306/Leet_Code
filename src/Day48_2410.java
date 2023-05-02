import java.util.Arrays;
public class Day48_2410 {
    public static void main(String[] args) {
        String s="aaa";

    }
    static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        int i=0;
        int j=0;
        while(i<players.length && j<trainers.length){
            if(players[i]>trainers[j]){
                j++;
            }else{
                count++;
                i++;
                j++;
            }
        }
        return count++;
    }
}
