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
    public List<Integer> preorderTraversal(TreeNode root) {
        prt(root,li);
        return li;
    }
    public static void prt(TreeNode root,List<Integer>li){
if(root ==null){
    return;
}
li.add(root.val);
prt(root.left,li);
prt(root.right,li);

    }
}