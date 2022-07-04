import java.util.Scanner;

public class InvertBinaryTree {
    public static TreeNode invertBinaryTreeRecursive(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertBinaryTreeRecursive(root.left);
        invertBinaryTreeRecursive(root.right);

        return root;
    }
    public static TreeNode takeInput() {
        TreeNode root = null;
        Scanner scan = new Scanner(System.in);
        
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.data = 1;
        TreeNode left = new TreeNode();
        left.data = 2;
        TreeNode right = new TreeNode();
        right.data = 3;
        root.left = left;
        root.right = right;
        root = invertBinaryTreeRecursive(root);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);


        
    }
}
