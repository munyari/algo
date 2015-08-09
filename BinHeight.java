// java.util.* has been imported for this problem.
// You don't need any other imports.

public int findHeight(TreeNode root) { 
    // Add your code below this line. Do not modify any other code.                   
    if (root == null)
        return 0;
    return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    // Add your code above this line. Do not modify any other code.
}