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
    ArrayList<Integer>li=new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {

        dfs(root);
        for(int i=0;i<li.size();i++){
            int v=li.get(i);
            if(li.contains(k-v)&& i!=li.indexOf(k-v)){
                return true;
            }
            
        }
        return false;
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