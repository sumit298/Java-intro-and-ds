class BinaryTree{
    TreeNode root;

    BinaryTree(){
        root = null;
    };
    
}

public class Inorder {
    public static void TreeInorder(TreeNode head){
        if(head == null){
            return;
        }
        TreeInorder(head.left);
        System.out.println(head.key + " ");
        TreeInorder(head.right);
    }

    public static void TreePreOrder(TreeNode head){
        if(head == null){
            return;
        }
        System.out.println(head.key + " ");
        TreePreOrder(head.left);
        TreePreOrder(head.right);
    }
    public static void main(String[] args) {
        // Created a new node of tree
        // TreeNode tree = new TreeNode(42);

    }

}
