/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int Tsum=0;
    public int sumNumbers(TreeNode root) {
        summ(root,0);
      return Tsum;
    }
    public void summ(TreeNode root,int sum){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null){
            Tsum+=sum*10+root.val;
             return ;
        }
sum= sum*10+root.val;
summ(root.left,sum);
summ(root.right,sum);

    }
}