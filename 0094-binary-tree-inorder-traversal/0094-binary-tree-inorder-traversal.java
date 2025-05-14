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
    List<Integer>li=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        ino(root,li);
        return li;
    }
   public static void ino(TreeNode root,List<Integer>li){
        if(root==null){
            return;
        }
        ino(root.left,li);
        li.add(root.val);
        ino(root.right,li);

    }
}