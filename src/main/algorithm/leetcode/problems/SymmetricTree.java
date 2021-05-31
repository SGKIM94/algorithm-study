package algorithm.leetcode.problems;

/**
 * leetcode
 * Symmetric Tree
     * easy
 *
 * https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {
    private boolean isSymmetric(TreeNode node1, TreeNode node2) {

        if (node1 == null && node2 == null)
            return true;

        if (node1 == null || node2 == null)
            return false;

        if (node1.val != node2.val)
            return false;

        boolean leftright = isSymmetric(node1.left, node2.right);
        boolean rightleft = isSymmetric(node1.right, node2.left);

        return leftright && rightleft;
    }
}
