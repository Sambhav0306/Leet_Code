public class Day20_19 {
    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=head;
        int size=size(head);
        if(size==1){
            return null;
        }
        int a=1;
        if(n==size){
            head=head.next;
            return head;
        }
        if(n==0){
            while(node.next!=null){
                node=node.next;
            }
            node.next=null;
            return head;
        }else{
            while(a!=size-n){
                node=node.next;
                a++;
            }
            if(node.next.next!=null){
                node.next=node.next.next;
            }else{
                node.next=null;
            }
            return head;
        }
    }
    public int size(ListNode head){
        ListNode node=head;
        int size=0;
        while(node!=null){
            size++;
            node=node.next;
        }
        return size;
    }
}
