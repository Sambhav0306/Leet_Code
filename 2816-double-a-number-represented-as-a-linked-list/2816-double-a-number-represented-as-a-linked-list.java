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
    public ListNode doubleIt(ListNode head) {
        ListNode node=reverse(head);
        head=node;
        int sum=0;
        while(node!=null){
            if(node.next==null){
                int ans=node.val*2+sum;
                node.val=ans%10;
                sum=ans/10;
                if(sum>0){
                    node.next=new ListNode(sum);
                    break;
                }else{
                    break;
                }
            }else{
                int ans=node.val*2+sum;
                node.val=ans%10;
                sum=ans/10;
                node=node.next;
            }
        }
        node=reverse(head);
        return node;
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
        head=prev;
        return head;
    }

}