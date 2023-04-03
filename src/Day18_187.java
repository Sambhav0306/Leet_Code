import java.util.*;
public class Day18_187 {
    static ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode node=head;
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        Collections.sort(list);
        int i=0;
        node=head;
        while(node!=null){
            node.val=list.get(i);
            node=node.next;
            i++;
        }
        return head;
    }
}
