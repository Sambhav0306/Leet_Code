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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null)
            return head;
        ListNode previous = null;
        ListNode current = head;
        k = k % size(head);
        while (k > 0) {
            while(current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            current.next = head;
            head = current;
            k--;
        }
        return head;
    }

    public int size(ListNode head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }
}