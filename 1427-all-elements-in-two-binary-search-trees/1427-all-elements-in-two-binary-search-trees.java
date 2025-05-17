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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        dfs(root1);
        dfs(root2);
        Collections.sort(li);
        return li;
    }
    public void dfs(TreeNode node){
if(node==null){
    return;
}
li.add(node.val);
dfs(node.left);
dfs(node.right);
    }
}