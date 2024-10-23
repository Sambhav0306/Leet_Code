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
    public boolean isCousins(TreeNode root, int x, int y) {
    if (root == null) return false;
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    
    while (!queue.isEmpty()) {
        int size = queue.size();
        boolean l = false;
        boolean r = false; 
        
        for (int i = 0; i < size; i++) { 
            TreeNode current = queue.poll();
            
            boolean l1 = false; 
            boolean r1 = false; 
            
            if (current.left != null) {
                if (current.left.val == x) l1 = true;
                if (current.left.val == y) r1 = true;
                queue.add(current.left);
            }
            
            if (current.right != null) {
                if (current.right.val == x) l1 = true;
                if (current.right.val == y) r1 = true;
                queue.add(current.right);
            }           
            if (l1 && r1) return false;
            
            if (l1) l = true;
            if (r1) r = true;
        }
        
        if (l && r) return true; 
        if (l || r) return false;
    }
    
    return false; 
}

}