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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int maxLen=depth(root);
return dfs(root,maxLen,0);
    }
public TreeNode dfs(TreeNode root,int maxLen,int curLen){
    if(root==null){
        return null;
    }
    if(curLen==maxLen-1){
        return root;
    }
    TreeNode l=dfs(root.left,maxLen,curLen+1);
    TreeNode r=dfs(root.right,maxLen,curLen+1);
    if(l!=null && r!=null){
        return root;
    }
    else if(l!=null){
        return l;
    }
    else{
        return r;
    }
    

}


    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}