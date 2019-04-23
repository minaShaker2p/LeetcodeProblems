import helpers.ListNode;


public class RemoveDuplicateLinkedListProblem83 {
    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     *
     * Example 1:
     *
     * Input: 1->1->2
     * Output: 1->2
     * Example 2:
     *
     * Input: 1->1->2->3->3
     * Output: 1->2->3
     */

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode first = head;
        ListNode second = head.next;

        while (second != null) {
            if (first.val == second.val) {
                first.next = second.next;
                second = second.next;
            } else {
                first = second;
                second=second.next;
            }
        }
        return head;

    }
}
