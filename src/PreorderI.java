// java.util.* has been imported for this problem.
// You don't need any other imports.

public ArrayList preorderItr(TreeNode root) {
    // Add your code below this line. Do not modify any other code.                   
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
    // Add your code above this line. Do not modify any other code.
}