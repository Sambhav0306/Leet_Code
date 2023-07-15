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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(9,null);
        ListNode node=head;
        ListNode node1=list1;
        ListNode node2=list2;
        if(node1==null && node2==null){
            return list1;
        }
        if(node1==null){
            return list2;
        }
        if(node2==null){
            return list1;
        }
        while(node1!=null && node2!=null){
            if(node1.val<node2.val){
                node.next=node1;
                node=node.next;
                node1=node1.next;
            }else{
                node.next=node2;
                node=node.next;
                node2=node2.next;
            }
        }
        while(node1!=null){
             node.next=node1;
            node=node.next;
            node1=node1.next;
        }
        while(node2!=null){
             node.next=node2;
            node=node.next;
            node2=node2.next;
        }
        return head.next;
    }
}