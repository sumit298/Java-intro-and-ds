import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        List<TreeNode> current = new ArrayList<>();
        current.add(root);
        while(current.size()>0){
            List<Integer> level = new ArrayList<>();
            List<TreeNode> parents = current;
            current = new ArrayList<>();
            for(TreeNode parent: parents){
                level.add(parent.data);
                if(parent.left!=null) current.add(parent.left);
                if(parent.right!=null) current.add(parent.right);
            }
            result.add(level);
        }
        return result;

    
    }

    public static List<List<Integer>> levelOrderTraversal2(TreeNode root){
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        if(root==null){
            return output;
        }

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = queue.size();
            for(int i=0; i<n; i++){
                TreeNode node = queue.peek();
                queue.poll();
                level.add(node.data);

                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

            }
            output.add(level);
            // reverse output
            
            
        }
        Collections.reverse(output);
        return output;
        // Time Complexity: O(n) 
        // how it is O(n)?
        // we are traversing each node once and adding it to the queue. So, the time complexity is O(n).
        // Space Complexity: O(n)
    }
    public static void main(String[] args) {
        
    }
}
