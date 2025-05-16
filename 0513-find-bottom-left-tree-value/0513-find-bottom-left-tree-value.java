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
    int max=-1;
    int res=0;
    public int findBottomLeftValue(TreeNode root) {
      dfs(root,0);
      return res;  
    }
    public void dfs(TreeNode root,int cur){
if(root==null){
    return;
}
if(cur>max){
    max=cur;
    res=root.val;
}
dfs(root.left,cur+1);
dfs(root.right,cur+1);
    }
}