class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        
        int len = 0;
        
        while (list1 != null) {
	
            if (len == a) {
                
                while (list2 != null) {
                    ans.next = list2;
                    ans = ans.next;
                    list2 = list2.next;                   
                }
                
                while (len != b + 1) {
                    list1 = list1.next;
                    ++len;
                }  
            }
            
            ans.next = list1;
            ans = ans.next;
            list1 = list1.next;
            ++len;       
        }
        return dummy.next;
    }    
} 