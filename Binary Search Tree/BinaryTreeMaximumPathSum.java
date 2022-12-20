public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxPathSum(root, max);
        return max[0];
    }

    private void maxPathSum(TreeNode root, int[] max) {
        if (root == null) {
            return;
        }

        int left = 0;
        int right = 0;

        if (root.left != null) {
            maxPathSum(root.left, max);
            left = Math.max(0, root.left.data);
        }

        if (root.right != null) {
            maxPathSum(root.right, max);
            right = Math.max(0, root.right.data);
        }

        max[0] = Math.max(max[0], left + right + root.data);
        root.data = Math.max(left, right) + root.data;
    }
    static int max_path_sum;
    public static int maxPathSum2(TreeNode root){
        max_path_sum = Integer.MIN_VALUE;
        pathSum(root);
        return max_path_sum;
    }
    public static int pathSum(TreeNode root){
        if(root==null) return 0;
        int left = Math.max(0, pathSum(root.left));
        int right = Math.max(0, pathSum(root.right));
        max_path_sum = Math.max(max_path_sum, left + right + root.data);
        return Math.max(left, right) + root.data;

    }

    public static void main(String[] args) {
        
    }

}
