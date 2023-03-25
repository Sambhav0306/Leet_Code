public class Day9_1669 {
    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

            ListNode dummy = new ListNode();
            ListNode ans = dummy;

            int len = 0;

            while (list1 != null) {

                // this is the position we need to append list2
                if (len == a) {

                    // adding list2 elements
                    while (list2 != null) {
                        ans.next = list2;
                        ans = ans.next;
                        list2 = list2.next;
                    }

                    // skipping list1 elements
                    while (len != b + 1) {
                        list1 = list1.next;
                        ++len;
                    }
                }

                // adding list1 elements
                ans.next = list1;
                ans = ans.next;
                list1 = list1.next;
                ++len;
            }
            return dummy.next;
        }
    }
}
