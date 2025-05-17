class BSTIterator {
    TreeNode curr = null;
    public BSTIterator(TreeNode root) {
        curr = root;
    }

    public TreeNode getLeftRightMost(TreeNode node, TreeNode parent){
        while(node.right != null && node.right != parent){
            node = node.right;
        }
        return node;
    }

    public int next() {
        int res = -1;
      while(curr != null){
        TreeNode left = curr.left;
        if(left == null){
            res = curr.val;
            curr = curr.right;
            break;
        }else{
          TreeNode leftchildRightMost = getLeftRightMost(curr.left, curr);
          if(leftchildRightMost.right == null){
            //thread create
            leftchildRightMost.right = curr;
            curr = curr.left;
          }else{
            //thread remove
            leftchildRightMost.right = null;
            res = curr.val;
            curr = curr.right;
            break;
          }
        }
      } 
      return res; 
    }
    
    public boolean hasNext() {
        return curr != null;
    }
}