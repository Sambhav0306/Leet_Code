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
        int size = 0;
        
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        ListNode start = head;
        ListNode end = head;
        int i = 0;
        
        while(i < k - 1 && start != null){
            start = start.next;
            i++;
        }
        
        i = 0;
        while(end != null && i < size - k){
            end = end.next;
            i++;
        }
        
        int val = start.val;
        start.val = end.val;
        end.val = val;
        return head;
    }
}