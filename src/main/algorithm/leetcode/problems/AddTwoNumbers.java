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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder firstNumbers = makeLinkedNumber(l1);
        StringBuilder secondNumbers = makeLinkedNumber(l2);

        firstNumbers.reverse();
        secondNumbers.reverse();

        int sum = Integer.parseInt(firstNumbers.toString()) + Integer.parseInt(secondNumbers.toString());

        String[] numbers = Integer.toString(sum).split("");

        ListNode node = null;
        for (String number : numbers) {
            node = new ListNode(Integer.parseInt(number), node);
        }

        return node;
    }

    private StringBuilder makeLinkedNumber(ListNode l1) {
        StringBuilder numbers = new StringBuilder(String.valueOf(l1.val));
        while (l1.next != null) {
            l1 = l1.next;

            numbers.append(l1.val);
        }

        return numbers;
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

    /**
     * 정합성 검증에 실패하여 정답 추가
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
