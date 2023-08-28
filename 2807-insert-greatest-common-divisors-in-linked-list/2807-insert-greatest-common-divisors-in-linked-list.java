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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
     ListNode curr=head;
     ListNode nex=head.next;
        while(curr.next!=null){
            ListNode node=new ListNode(gcd(curr.val,nex.val));
            curr.next=node;
            node.next=nex;
            curr=nex;
            nex=nex.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}