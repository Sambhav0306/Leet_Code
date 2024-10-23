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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(queue.size()!=0){
            int sum=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                if(queue.peek().left!=null){
                    sum+=queue.peek().left.val;
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    sum+=queue.peek().right.val;
                    queue.add(queue.peek().right);
                }
                queue.poll();
            }
            map.put(j,sum);
            j++;
        }
        root.val=0;
        // return root;/
        queue.add(root);
         j=0;
        while(queue.size()!=0){
            int size=queue.size();
            int sum=map.get(j);
            for(int i=0;i<size;i++){
                int a=0;
                 if(queue.peek().left!=null){
                    a+=queue.peek().left.val;
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    a+=queue.peek().right.val;
                    queue.add(queue.peek().right);
                }
                 if(queue.peek().left!=null){
                    queue.peek().left.val=sum-a;
                }
                if(queue.peek().right!=null){
                    queue.peek().right.val=sum-a;
                }
                queue.poll();
            }
            j++;
        }
        return root;
    }
}