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
    public int gcd(int curr,int next){
        int max=Math.max(curr,next);
        int min=Math.min(curr,next);
        if(max%min==0) return min;
        int i=min;
        while(i!=1){
            if(max%i==0 && min%i==0) return i;
            // max=max/i;
            i--;
        }
        return 1;
    }
}