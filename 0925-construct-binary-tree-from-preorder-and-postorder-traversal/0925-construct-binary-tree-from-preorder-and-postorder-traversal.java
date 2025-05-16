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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int []idx=new int[1];
        idx[0]=0;
        return build(preorder,postorder,idx,0,preorder.length-1);
    }
    public TreeNode build(int []pre,int []post,int []idx,int l,int h){
        if(idx[0]>=pre.length || l>h){
            return null;
        }
        TreeNode root=new TreeNode(pre[idx[0]++]);
        if(l==h){
            return root;
        }
        int i;
        for(i=l;i<=h;i++){
            if(post[i]==pre[idx[0]]){
                break;
            }
        }
        if(l<=h){
            root.left=build(pre,post,idx,l,i);
            root.right=build(pre,post,idx,i+1,h-1);
        }
        return root;
    }
}