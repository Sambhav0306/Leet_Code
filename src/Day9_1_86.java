public class Day9_1_86 {
    ListNode partition(ListNode head, int x) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode node=head;
        ListNode node1 = new ListNode(0,null);
        ListNode he=node1;
        while(node!=null){
            if(node.val<x){
                ListNode nodee=new ListNode(node.val,null);
                node1.next=nodee;
                node1=node1.next;
            }
            node=node.next;
        }
        node=head;
        while(node!=null){
            if(node.val>=x){
                ListNode nodee=new ListNode(node.val,null);
                node1.next=nodee;
                node1=node1.next;
            }
            node=node.next;
        }
        return he.next;
    }

    public static void main(String[] args) {
        Day9_1_86 obj=new Day9_1_86();

    }
}
