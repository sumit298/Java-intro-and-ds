public class Range_Sum_Of_BST {
    public static int rangeSumBST(TreeNode root, int L, int R){
        if(root == null){
            return 0;
        }
        if(root.data >= L && root.data <= R){
            return rangeSumBST(root.left, L, R) + root.data + rangeSumBST(root.right, L, R);
        }
        else if(root.data < L){
            return rangeSumBST(root.right, L, R);
        }
        else{
            return rangeSumBST(root.left, L, R);
        }
    }
    public static void main(String[] args) {
        System.out.println("h");
    }
}
