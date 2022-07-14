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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    LinkedList<TreeNode> stack = new LinkedList<>();
    TreeNode fh = new TreeNode();
    TreeNode w  = fh;
    
    for(int p = 0, i = 0; p != preorder.length;){
      for(; !stack.isEmpty() && stack.getLast().val == inorder[i]; i++)
        w = stack.pollLast();
      
      w = w.right = new TreeNode();
      
      while(true){
        stack.addLast(w);
        w.val = preorder[p];
        if(preorder[p++] == inorder[i]) break;
        w = w.left = new TreeNode();
      }
    }
    
    return fh.right;
    }
}