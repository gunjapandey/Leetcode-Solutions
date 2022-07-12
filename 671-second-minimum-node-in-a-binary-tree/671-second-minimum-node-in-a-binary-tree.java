class Solution {
    long min = Long.MAX_VALUE;
    long sec = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        if (root==null)return -1;
        calculate(root);
        if (sec==Long.MAX_VALUE)return -1;
        else return (int)sec;
    }
    
    void calculate (TreeNode node){
        if (node==null)return ;
        
        if (node.val<min){
            sec = min; min = node.val;
        } else if (node.val!=min) {
            if (node.val<sec)sec = node.val;
        }
        
        calculate(node.left);
        calculate(node.right);
        
    }
    
}