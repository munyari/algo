public ArrayList<Integer> postorderItr(TreeNode root) {

  ArrayList<Integer> postOrderedList = new ArrayList<Integer>();
  if(root == null) return null;
  Stack<TreeNode> stack = new Stack<TreeNode>();
  stack.push(root);
  TreeNode prev = null;
  while(!stack.empty()){
    TreeNode curr = stack.peek();
    //traverse down the tree and check if current node is leaf.
    //if current node is a leaf, then process it and pop stack else continue down the tree
    if(prev == null || prev.left == curr || prev.right == curr){
      //prev == null is the situation for the root node
      if(curr.left != null){
        stack.push(curr.left);
      }else if(curr.right != null){
        stack.push(curr.right);
      }else{
        stack.pop();
        postOrderedList.add(curr.data);
      }
      //traverse up the tree from left node and check if there is a right child
      //if yes, push it to stackelse, process parent and pop stack
    }else if(curr.left == prev){
      if(curr.right != null){
        stack.push(curr.right);
      }else{
        stack.pop();
        postOrderedList.add(curr.data);
      }
      //traverse up the tree from right node and process parent node and pop stack.
    }else if(curr.right == prev){
      stack.pop();
      postOrderedList.add(curr.data);
    }
    prev = curr;
  }
  return postOrderedList;
}
