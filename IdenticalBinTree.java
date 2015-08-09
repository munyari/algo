// java.util.* has been imported for this problem.
// You don't need any other imports.

public boolean isIdentical(TreeNode root1, TreeNode root2) {
    // Add your code below this line. Do not modify any other code.                   
    if (root1 == null && root2 == null) {
        return true;
    }
    if (root1 == null || root2 == null) {
        return false;
    }
    if (root1.data != root2.data) {
        return false;
    }
    return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    // Add your code above this line. Do not modify any other code.
}