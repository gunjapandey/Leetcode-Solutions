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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        sum=func(root, 0);
        return sum;
    }
    
    int func(TreeNode node, int num){
        if (node==null)return sum;
        num*=10; num+=node.val;
        if (node.left==null && node.right==null){
            sum += num;
            return sum;
        }
        func(node.left, num);
        func(node.right, num);
        return sum;
    }  
}
