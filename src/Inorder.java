
//Populate the data in the below list in inorder.
public ArrayList inorderedList = new ArrayList();
public void inorder(TreeNode root) {
    if (root == null)
    {
        return;
    }
    inorder(root.left);
    inorderedList.add(root.data);
    inorder(root.right);
}
