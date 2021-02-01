package algorithm.leetcode.problems;

import javax.swing.tree.TreeNode;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return help(root,0);
    }

    public int help(TreeNode root, int num) {
        num = num*10 + root.val;
        if (root.left == null && root.right == null)
            return num;
        int l = 0, r = 0;
        if (root.left != null)
            l = help(root.left, num);
        if (root.right != null)
            r = help(root.right, num);
        return l + r;
    }
}
