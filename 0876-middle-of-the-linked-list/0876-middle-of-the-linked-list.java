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
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        if(head.next.next==null){
            head=head.next;
            return head;
        }
        ListNode node=head;
        int size=size(head);
        int i=1;
        if(size%2==1){
            while(i<=size/2){
                node=node.next;
                i++;
            }
            head=node;
        }else{
            while(i<size/2+1){
                node=node.next;
                i++;
            }
            head=node;
        }
        return head;
    }
    public int size(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}