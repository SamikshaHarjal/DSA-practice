class Solution {
    List<Integer>li=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postT(root,li);
        return li;
    }
public static void postT(TreeNode root,List<Integer>li){
if(root==null){
    return;
}
postT(root.left,li);
postT(root.right,li);
li.add(root.val);
}   
    }