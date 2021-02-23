package algorithm.leetcode.problems;

import org.junit.Test;

public class MergeTwoListsTest {

    @Test
    public void mergeTwoLists() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        MergeTwoLists.ListNode answer = mergeTwoLists.mergeTwoLists(new MergeTwoLists.ListNode(1), new MergeTwoLists.ListNode(2));

        assertThat(answer).isEqualTo(3);
    }
}
