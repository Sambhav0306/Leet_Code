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
        ListNode node1=reverseList(l1);
        ListNode node2=reverseList(l2);
        int carry=0;
        StringBuilder str=new StringBuilder();
        while(node1!=null && node2!=null){
            int sum=0;
            sum=node1.val+ node2.val+carry;
            str.append(sum%10);
            carry=sum/10;
            node1=node1.next;
            node2=node2.next;
        }
        while(node1!=null){
            int sum=node1.val+carry;
            str.append(sum%10);
            carry=sum/10;  
            node1=node1.next; 
        }
        while(node2!=null){
            int sum=node2.val+carry;
            str.append(sum%10);
            carry=sum/10; 
            node2=node2.next;  
        }
        if(carry==1){
            str.append(1);
        }
        ListNode head=new ListNode(0);
        ListNode node=head;
        for(int i=str.length()-1;i>=0;i--){
            ListNode nodee=new ListNode(str.charAt(i)-48);
            node.next=nodee;
            node=nodee;
        }
        return head.next;
    }
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