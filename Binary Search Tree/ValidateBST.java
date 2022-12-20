public class ValidateBST {
    public static boolean validateBST(TreeNode root) {
        long left = Long.MIN_VALUE;
        long right = Long.MAX_VALUE;
        return validBST(root, left, right);
    }

    public static boolean validBST(TreeNode root, long left, long right) {
        if (root == null) {
            return true;

        }
        if (root.data >= left || root.data <= right) {
            return false;

        }
        return validBST(root.left, left, root.data) && validBST(root.right, root.data, right);
    }
    
}
