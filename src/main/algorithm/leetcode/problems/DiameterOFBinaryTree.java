package algorithm.leetcode.problems;

/**
 * leetcode
 * DiameterOFBinaryTree
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class DiameterOFBinaryTree {
    int maxDepth = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDepth;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        maxDepth = Math.max(maxDepth, left + right);

        return Math.max(left, right) + 1;
    }
}
