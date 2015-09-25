// This is your past saved code. Click 'Copy Over' to move it to the editor.
// Click 'Hide' to hide me.

// java.util.* has been imported for this problem.
// You don't need any other imports.

//Populate the data in the below list in inorder.
public ArrayList inorderedList = new ArrayList();
public void inorder(TreeNode root) {
    // Add your code below this line. Do not modify any other code.                   
    if (root == null)
    {
        return;
    }
    inorder(root.left);
    inorderedList.add(root.data);
    inorder(root.right);
    // Add your code above this line. Do not modify any other code.
}