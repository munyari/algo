
public int numberOfLeaves(TreeNode root) { 
    if (root == null)
    {
        return 0;
    }
    int these = 0;
    if (root.left == null || root.right == null) {
        these++;
    }
    return these + numberOfLeaves(root.right) + numberOfLeaves(root.left);
    
}
