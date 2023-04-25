import java.util.*;
public class Day40_2336 {
    int min = 1;
    PriorityQueue<Integer> pq;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
    }

    public int popSmallest() {
        if(!pq.isEmpty()){
            return pq.poll();
        }
        min++;
        return min - 1;
    }

    public void addBack(int num) {
        if(!pq.contains(num) && min > num){
            pq.add(num);
        }
    }
}
