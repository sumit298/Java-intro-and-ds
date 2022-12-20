import java.util.ArrayList;
import java.util.List;

public class Leaf_Similar_Trees {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2){
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(leaves1, root1);
        dfs(leaves2, root2);
        return leaves1.equals(leaves2);
    }
    private static void dfs(List<Integer> leafValues, TreeNode root) {
        if(root == null){
            return;
        }
        // if there is only leaf value
        if(root.left == null && root.right == null){
            leafValues.add(root.data);
        }
        // for left child
        dfs(leafValues, root.left);
        // for right sub tree
        dfs(leafValues, root.right);
    }
    public static void main(String[] args) {
        
    }
}
