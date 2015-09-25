
public ArrayList preorderItr(TreeNode root) {
    ArrayList preorder = new ArrayList();
    Stack stack = new Stack();
    while (true) {
        while (root != null) {
            preorder.add(root.data);
            stack.push(root);
            root = root.left;
        }
        if (!stack.isEmpty()) {
            root = stack.pop().right;
        }
        else {
            break;
        }
    }
    return preorder;
}
