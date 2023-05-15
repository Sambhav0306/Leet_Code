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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node = head;
        ListNode val1=head;
        ListNode val2=head;
        int size=size(head);
        for(int i=1;i<=size;i++){
            if(i==k){
                break;
            }
            val1=val1.next;
        }
        for(int i=1;i<=size;i++){
            if(i==size-k+1){
                break;
            }
            val2=val2.next;
        }
        int temp=val1.val;
        val1.val=val2.val;
        val2.val=temp;
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