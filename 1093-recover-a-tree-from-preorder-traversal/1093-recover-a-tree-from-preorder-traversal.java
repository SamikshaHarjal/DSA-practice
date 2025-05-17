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
    public TreeNode recoverFromPreorder(String traversal) {
        int n=traversal.length();
        TreeNode[]li=new TreeNode[10001];
        int root=0,i=0;
        while(i<n&&traversal.charAt(i)!='-'){
            root=root*10+(traversal.charAt(i)-'0');
            i++;
        }
        li[0]=new TreeNode(root);
        while(i<n){
            int count=0;
            while(i<n && traversal.charAt(i)=='-'){
            i++;count++;
            }
            int node=0;
            while(i<n && traversal.charAt(i)!='-'){
                node=node*10+(traversal.charAt(i)-'0');
                i++;
            }
            TreeNode child=new TreeNode(node);
            TreeNode parent= li[count-1];
            if(parent.left==null){
                parent.left=child;
            }
            else{
                parent.right=child;
              
            }
              li[count]=child;
        }
        return li[0];
    }
}