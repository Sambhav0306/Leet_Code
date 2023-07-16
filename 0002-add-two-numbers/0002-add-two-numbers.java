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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode node1= l1;
     ListNode node2= l2;
     ListNode head=new ListNode(0,null);
     ListNode node=head;
     int count=0;
     while(node1!=null && node2!=null){
         int sum=node1.val+node2.val+count;
         node.next=new ListNode(sum%10,null);
         node=node.next;
         node1=node1.next;
         node2=node2.next;
         count=sum/10;
     }
     while(node1!=null){
         int sum=node1.val+count;
         node.next=new ListNode(sum%10,null);
         node=node.next;
         node1=node1.next;
         count=sum/10;
     }
        while(node2!=null){
         int sum=node2.val+count;
         node.next=new ListNode(sum%10,null);
         node=node.next;
         node2=node2.next;
         count=sum/10;
     }
        if(count!=0){
            node.next=new ListNode(count,null);
        }
        return head.next;
    }
     public ListNode reverse(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode fut=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=fut;
            if(fut!=null){
               fut=fut.next;
            }
        }
        return prev;
    }
}