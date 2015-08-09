// java.util.* has been imported for this problem.
// You don't need any other imports.

//Populate the elements of the tree in the below list in the post order way.
ArrayList postOrderedList = new ArrayList();
public void postorder(TreeNode root) {
    // Add your code below this line. Do not modify any other code.                   
    if (root == null)
    {
        return;
    }
    postorder(root.left);
    postorder(root.right);
    postOrderedList.add(root.data);
    // Add your code above this line. Do not modify any other code.
}