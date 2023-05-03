import java.util.*;
public class Day49_817 {
    static int numComponents(ListNode head, int[] nums) {
        ListNode node=head;
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(node!=null){
            if(set.contains(node.val)){
                count++;
                while(node!=null && set.contains(node.val)){
                    node=node.next;
                }
            }
            if(node!=null){
                node=node.next;
            }
        }
        return count++;
    }
}
