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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode previous=null;
        ListNode present=head;
        ListNode nex=present.next;
        while(present!=null){
            present.next=previous;
            previous=present;
            present=nex;
            if(nex!=null){
                nex=nex.next;
            }  
        }
        head=previous;
        return head;
    }
}