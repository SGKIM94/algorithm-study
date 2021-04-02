package algorithm.leetcode.problems;

/**
 * leetcode
 * MergeTwoLists
 * level : easy
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * https://leetcode.com/problems/merge-two-sorted-lists/discuss/1077637/Java-Solution-Explanation-%2B-Code
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;


        while (l1 != null || l2 != null) {
            if (l2 == null || (l1 != null && l1.val < l2.val)) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }

        return head.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
