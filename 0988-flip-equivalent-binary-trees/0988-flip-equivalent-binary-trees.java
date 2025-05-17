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

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
      return in_post(root1,root2);
    
    }
    boolean in_post(TreeNode root1,TreeNode root2){
        if(root1==null&& root2==null){
            return true;
        }
         if(root1==null || root2==null||root1.val!=root2.val){
            return false;       
        } 
  return (in_post(root1.left,root2.right)||in_post(root1.left,root2.left))&&(in_post(root1.right, root2.left) || in_post(root1.right, root2.right));
    }
}