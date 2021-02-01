package algorithm.leetcode.problems;

/**
 * leetcode
 * SumRootToLeafNumbers
 * level : medium
 * 다시 풀어보기
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int num) {
        num = num * 10 + root.val;

        if (root.left == null && root.right == null) {
            return num;
        }

        int left = 0;
        int right = 0;

        if (root.left != null) {
            left = dfs(root.left, num);
        }

        if (root.right != null) {
            right = dfs(root.right, num);
        }

        return left + right;
    }

    static class TreeNode { int val;
        private TreeNode left;
        private TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
