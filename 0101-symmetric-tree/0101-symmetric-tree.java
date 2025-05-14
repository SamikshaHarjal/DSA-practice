
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return ans(root,root);
    }
    public static boolean ans(TreeNode root1,TreeNode root2){
if(root1==null&&root2==null){
    return true;
}if(root1==null||root2==null||root1.val!=root2.val){
    return false;
}
return ans(root1.left,root2.right)&&ans(root1.right,root2.left);

    }
}
