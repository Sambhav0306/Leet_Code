import java.util.ArrayList;
 public class Day50_82 {
    ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode node=head;
        while(node!=null){
            int counter=0;
            while(node.next!=null && node.val == node.next.val){
                node=node.next;
                counter++;
            }
            if(counter>0){
                if(node.next!=null){
                    node=node.next;
                }else{
                    break;
                }
            }else{
                list.add(node.val);
                node=node.next;
            }
        }
        ListNode nodee=new ListNode(0);
        ListNode node1=nodee;
        int i=0;
        while(i<list.size()){
            ListNode node2=new ListNode(list.get(i));
            node1.next=node2;
            node1=node1.next;
            i++;
        }
        return nodee.next;
    }
}
