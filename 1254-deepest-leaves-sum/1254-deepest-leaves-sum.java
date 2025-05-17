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
    int summ=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int depth=depth(root);
int res=sum(root,0,depth);
res=summ;
return res;
    }
    public int depth(TreeNode root){
         if(root==null){
            return 0;
         }
         return 1+ Math.max(depth(root.left),depth(root.right));
    }
    public int sum(TreeNode root,int cur,int depth){
        if(root==null){
            return 0;
        }
        if(cur+1==depth){
            summ+=root.val;
        }
      sum(root.left,cur+1,depth);
      sum(root.right,cur+1,depth);
        return 0;
    }
}