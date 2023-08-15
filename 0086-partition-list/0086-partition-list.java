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
    public ListNode partition(ListNode head, int x) {
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
}