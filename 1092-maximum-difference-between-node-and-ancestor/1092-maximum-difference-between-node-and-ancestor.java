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
    int dif=0;
    public int maxAncestorDiff(TreeNode root) {
    int val=root.val;
    dfs(root,val,val);
    return dif;
    }
    public void dfs(TreeNode root,int min,int max){
        if(root==null){
            return;
        }
        int val=root.val;
        if(val>max){
            max=val;
        }
        if(val<min){
            min=val;
        }
dif=Math.max(dif,Math.abs(max-min));
dfs(root.left,min,max);
dfs(root.right,min,max);
    }
}