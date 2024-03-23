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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode node=head;
        while(node!=null){
            stack.push(node);
            node=node.next;
        }
        int size=size(head);
        node=head;
        int a=0;
        while(a<size/2){
            ListNode temp=node.next;
            node.next=stack.pop();
            node=node.next;
            node.next=temp;
            node=node.next;
            a++;
        }
        node.next=null;
    }
    public int size(ListNode node){
        int size=0;
        while(node!=null){
            size++;
            node=node.next;
        }
        return size;
    }
}