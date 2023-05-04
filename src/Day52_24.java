public class Day52_24 {
    ListNode swapPairs(ListNode node) {
        if(node==null){
            return node;
        }
        ListNode head= node;
        while(node!=null && node.next!=null){
            int temp= node.val;
            node.val=node.next.val;
            node.next.val=temp;
            node=node.next.next;
        }
        return head;
    }
}
