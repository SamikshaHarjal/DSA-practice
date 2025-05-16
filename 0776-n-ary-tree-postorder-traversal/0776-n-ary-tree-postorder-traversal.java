/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
      List<Integer>li=new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
      if(root==null){
        return li;
      }
        return postT(root,li);
        
    }
public static  List<Integer> postT(Node root,List<Integer>li){
for(Node child:root.children){
if(root!=null){
   postT(child,li);
}}

li.add(root.val);
return li;



}

}