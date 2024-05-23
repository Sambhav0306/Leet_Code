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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        ListNode node1=new ListNode();
        ListNode head=node1;
        for(int i=0;i<lists.length;i++){
            ListNode node=lists[i];
            while(node!=null){
                list.add(node.val);
                node=node.next;
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            node1.next=new ListNode(list.get(i),null);
            node1=node1.next;
        }
        return head.next;
    }
}