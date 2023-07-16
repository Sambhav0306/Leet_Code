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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=head;
        int size=size(node);
        if(size==1){
            return null;
        }
        if(size==n){
            return head.next;
        }
        int i=1;
        while(i!=size-n){
            node=node.next;
            i++;
        }
        if(node.next.next!=null){
            node.next=node.next.next;
        }else{
            node.next=null;
        }
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