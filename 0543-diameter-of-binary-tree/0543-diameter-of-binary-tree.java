/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
   int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;

        }
        height(root);
        return diameter;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lf = height(root.left);
        int rt = height(root.right);
        int dia=lf+rt;
diameter=max(dia,diameter);
        return max(lf, rt) +1;
    }

    public int max(int r, int l) {
        if (r > l) {
            return r;
        } else {
            return l;
        }
    }
}