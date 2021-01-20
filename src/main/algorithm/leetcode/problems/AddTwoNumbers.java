package algorithm.leetcode.problems;

/**
 * leetcode
 * AddTwoNumbers
 * level : medium
 */
public class AddTwoNumbers {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            StringBuilder firstNumbers = new StringBuilder(String.valueOf(l1.val));
            while (l1.next != null) {
                l1 = l1.next;

                firstNumbers.append(l1.val);
            }

            StringBuilder secondNumbers = new StringBuilder(String.valueOf(l2.val));
            while (l2.next != null) {
                l2 = l2.next;

                secondNumbers.append(l2.val);
            }

            firstNumbers.reverse();
            secondNumbers.reverse();

            int sum = Integer.parseInt(firstNumbers.toString()) + Integer.parseInt(secondNumbers.toString());

            String[] numbers = Integer.toString(sum).split("");

            ListNode node = new ListNode(Integer.parseInt(numbers[0]), new ListNode());

            for (String number : numbers) {
                node = new ListNode(Integer.parseInt(number), node);
            }

            return node;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
