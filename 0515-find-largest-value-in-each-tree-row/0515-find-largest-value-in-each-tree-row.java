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
    public List<Integer> largestValues(TreeNode root) {
    List<Integer>li=new ArrayList<>();
        if(root==null){
            return li;
        }
        Queue<TreeNode>qu=new LinkedList<>();
        qu.offer(root);//add root as first
        while(!qu.isEmpty()){
            int cur=qu.size();
            int max=-2147483648;//min int val for edge cases
            for(int i=0;i<cur;i++){
                TreeNode node=qu.poll();
                max=Math.max(max,node.val);//picks max value from left or right of a child
            
            if(node.left!=null){
                qu.offer(node.left);
            }
             if(node.right!=null){
                qu.offer(node.right);
            } 
        }
         li.add(max);//adds max val to the arraylist at between a particular child node 
    }
     return li;
}
}