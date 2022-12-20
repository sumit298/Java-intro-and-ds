public class _235_Lowest_Common_Ancestor_of_Binary_Tree {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
}

// This is a method that takes in a binary tree and two nodes p and q, and returns the lowest common ancestor (LCA) of p and q in the tree.

// The method works by recursively traversing the tree from the root node. If the current node is null or one of the nodes p or q, it returns the node. Otherwise, it recursively searches for the LCA in the left and right subtrees of the current node.

// If the LCA is found in the left subtree, the method returns the left subtree. If it is found in the right subtree, the method returns the right subtree. If the LCA is not found in either subtree, it means that p and q are in different subtrees, and the current node is the LCA.


// if (root == null || root == p || root == q) {
//     return root;
//   }
//   This line checks whether the current node is null or one of the nodes p or q. If it is, the method returns the node.
  
//   TreeNode left = lowestCommonAncestor(root.left, p, q);
//   TreeNode right = lowestCommonAncestor(root.right, p, q);
//   These lines recursively search for the LCA in the left and right subtrees of the current node.
  
//   if (left == null) {
//     return right;
//   }
//   if (right == null) {
//     return left;
//   }
//   return root;
//   If the LCA is found in the left subtree, the method returns the left subtree. If it is found in the right subtree, the method returns the right subtree. If the LCA is not found in either subtree, it means that p and q are in different subtrees, and the current node is the LCA.