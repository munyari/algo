
//Populate the elements of the tree in the below list in the post order way.
ArrayList postOrderedList = new ArrayList();
public void postorder(TreeNode root) {
    if (root == null)
    {
        return;
    }
    postorder(root.left);
    postorder(root.right);
    postOrderedList.add(root.data);
}
