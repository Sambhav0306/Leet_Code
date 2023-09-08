/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
        List<Integer> list1=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                for(int j=0;j<queue.peek().children.size();j++){
                    queue.offer(queue.peek().children.get(j));
                }
                list1.add(queue.poll().val);
            }
            list.add(list1);
        }
        return list;
    }
}