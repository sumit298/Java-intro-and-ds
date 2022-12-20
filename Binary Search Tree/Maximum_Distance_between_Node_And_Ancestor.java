public class Maximum_Distance_between_Node_And_Ancestor {
    public static int maxAncestorDiff(TreeNode root){
        int maxNum = 0;
        int minNum = 100000;
        return findMax(root,maxNum, minNum);

    }
    public static int findMax(TreeNode root, int maxNum, int minNum){
        if(root==null){
            return maxNum - minNum;
        }
        maxNum = Math.max(maxNum, root.data);
        minNum = Math.min(minNum, root.data);
        return Math.max(findMax(root.left, maxNum, minNum), findMax(root.right, maxNum, minNum));
    }
    public static void main(String[] args) {
        
    }
}
