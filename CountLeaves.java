// java.util.* has been imported for this problem.
// You don't need any other imports.

public int numberOfLeaves(TreeNode root) { 
    // Add your code below this line. Do not modify any other code.                   
    if (root == null)
    {
        return 0;
    }
    int these = 0;
    if (root.left == null || root.right == null) {
        these++;
    }
    return these + numberOfLeaves(root.right) + numberOfLeaves(root.left);
    
    // Add your code above this line. Do not modify any other code.
}