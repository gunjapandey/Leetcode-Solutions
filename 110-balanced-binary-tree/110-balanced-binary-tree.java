class Solution {
    private boolean status = true;
    public boolean isBalanced(TreeNode root) {
        getHeight(root);
        return status;
    }
    
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = 1 + getHeight(root.left);
        int rightHeight = 1 + getHeight(root.right);
        
        if (Math.abs(rightHeight - leftHeight) > 1) {
           status = false;
        }
        return Math.max(leftHeight, rightHeight);
    }
}