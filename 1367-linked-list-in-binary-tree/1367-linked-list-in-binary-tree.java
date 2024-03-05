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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) return true; // Empty linked list is always a subpath
        if (root == null) return false; // Tree is empty, so no subpath possible
        
        // Check if the current node's value matches the value in the linked list
        return isSub(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean isSub(ListNode head, TreeNode root) {
        if (head == null) return true; // Reached the end of the linked list
        if (root == null) return false; // Reached the end of the tree
        
        // Check if the current node's value matches the value in the linked list
        if (head.val == root.val) {
            // If there's a match, continue checking the next nodes in the linked list and tree
            return isSub(head.next, root.left) || isSub(head.next, root.right);
        }
        
        // If the current node's value doesn't match, it's not a subpath
        return false;
    }
}