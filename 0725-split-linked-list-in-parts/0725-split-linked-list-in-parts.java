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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=size(head);
        ListNode[] arr=new ListNode[k];
        if(k>=size){
            ListNode node=head;
            int i=0;
            while(node!=null){
                arr[i]=node;
                ListNode node1=node;
                node=node.next;
                node1.next=null;
                i++;
            }
        }else{
            if(size%k==0){
                ListNode node=head;
                ListNode index=node;
                int a=size/k;
                int i=0;
                int j=1;
                while(node!=null){
                    if(j==a){
                      ListNode node1=node;
                      node=node.next;
                      node1.next=null;
                      arr[i]=index;
                        i++;
                        index=node;
                        j=1;
                    }else{
                        node=node.next;
                        j++;
                    }
                }
            }else{
                int i=0;
                int j=1;
                ListNode node=head;
                ListNode index=head;
                int a=size/k;
                int mod=size%k;
                while(mod!=0){
                    if(j==a+1){
                      ListNode node1=node;
                      node=node.next;
                      node1.next=null;
                      arr[i]=index;
                        i++;
                        index=node;
                        j=1;
                        mod--;
                    }else{
                        node=node.next;
                        j++;
                    }
                }
                while(node!=null){
                    if(j==a){
                      ListNode node1=node;
                      node=node.next;
                      node1.next=null;
                      arr[i]=index;
                        i++;
                        index=node;
                        j=1;
                    }else{
                        node=node.next;
                        j++;
                    }
                }
            }
        }
        return arr;
    }
    public int size(ListNode head){
        int size=0;
        ListNode node=head;
        while(node!=null){
            size++;
            node=node.next;
        }
        return size;
    }
}