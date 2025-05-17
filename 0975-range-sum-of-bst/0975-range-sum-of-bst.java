class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int sum=0;
        int val=root.val;
        if(val>=low && val<=high){
         return sum+=val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        }
        else if(val<low){
            return sum+=rangeSumBST(root.right,low,high);
        }
        else{
            return sum+=rangeSumBST(root.left,low,high);
        }    
    }
}