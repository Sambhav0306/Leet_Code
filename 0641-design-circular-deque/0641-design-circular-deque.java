public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class MyCircularDeque {
    int size=0;
    int s;
    ListNode head;
    ListNode node;
    public MyCircularDeque(int k) {
        head=new ListNode(0,null);
        node=head;
        s=k;
    }
    
    public boolean insertFront(int value) {
        if(size==s) return false;
        if(head.next==null){
            ListNode temp=new ListNode(value,null);
            head.next=temp;
            node=temp;
        }else{
            ListNode temp=new ListNode(value,null);
            ListNode head1=head.next;
            head.next=temp;
            temp.next=head1;
        }
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size==s) return false;
        if(head.next==null){
            ListNode temp=new ListNode(value,null);
            head.next=temp;
            node=temp;
        }else{
            ListNode temp=new ListNode(value,null);
            node.next=temp;
            node=temp;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size==0) return false;
        if(head.next.next==null){
            head.next=null;
        }else{
            head.next=head.next.next;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size==0) return false;
        ListNode node1=head;
        if(head.next.next==null){
            head.next=null;
            node=head;
        }else{
            while(node1.next.next!=null){
                node1=node1.next;
            }
            node1.next=null;
            node=node1;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(size==0) return -1;
        return head.next.val;
    }
    
    public int getRear() {
        if(size==0) return -1;
        return node.val;
    }
    
    public boolean isEmpty() {
        if(size==0) return true;
        return false;
    }
    
    public boolean isFull() {
        if(size==s) return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */