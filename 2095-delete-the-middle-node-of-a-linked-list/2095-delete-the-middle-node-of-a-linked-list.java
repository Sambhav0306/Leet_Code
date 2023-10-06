/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        if(head.next.next==null) {
            head.next=null;
            return head;
        }
        int size=size(head);
        int len=0;
        ListNode node=head;
        if(size%2==0)  len=size/2;
        else len=(size-1)/2;
        int i=0;
        while(i!=len-1){
            node=node.next;
            i++;
        }
        node.next=node.next.next;
        return head;
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