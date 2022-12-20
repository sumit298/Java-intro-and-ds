import java.util.ArrayList;
import java.util.List;

public class Maximum_Product_of_Splitted_Binary_Tree {
    public static int maxProduct(TreeNode root){
        long sum = sum(root);
        long[] max = new long[1];
        max[0] = Integer.MIN_VALUE;
        findMax(root, sum, max);
        return (int) (max[0] % 1000000007);
    }
    public static long sum(TreeNode root){
        if(root == null){
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }
    public static long findMax(TreeNode root, long sum, long[] max){
        if(root == null){
            return 0;
        }
        long left = findMax(root.left, sum, max);
        long right = findMax(root.right, sum, max);
        max[0] = (int) Math.max(max[0], (sum - left) * left);
        max[0] = (int) Math.max(max[0], (sum - right) * right);
        return root.data + left + right;
    }
    static int answer = 0;
    public static int maxProduct2(TreeNode root){
        int Total = totalSum(root);
        
        int newans = productMax(root, Total, answer);
        answer = newans;
        return answer;
    }

    private static int productMax(TreeNode root, int total, int ans) {
        if(root==null){
            return 0;
        }
        int subTreeSum = 0;
        subTreeSum +=productMax(root.left, total, ans);
        subTreeSum +=productMax(root.right, total, ans);
        subTreeSum += root.data;
        if(subTreeSum*(total-subTreeSum)>ans){
            ans = subTreeSum*(total-subTreeSum);
        }
        return subTreeSum;


    }
    public static int totalSum(TreeNode root){
        if(root==null){
            return 0;
        }
        return totalSum(root.left) + totalSum(root.right) + root.data;
    }
    // static long mod = 1000000007;
    // static long totalSum = 0;
    // static long ans = 0;
    // public static long find(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }
    //     long sum = find(root.left) + find(root.right) + root.data;
    //     ans = Math.max(ans, (totalSum-sum)*sum);
    //     return sum;
    // }
    // public static int maxProduct3(TreeNode root){
    //     totalSum = find(root);
    //     find(root);
    //     return (int) (ans%mod);
    // }
    List<Long> list;
    long mod = 1000000007;
    public int maxProduct4(TreeNode root) {
        list = new ArrayList<>();
        long total = postOrder(root);
        long max = 0;
        long prod = 0;
        
        for(int i = 0; i < list.size() - 1; i++){
            prod = (list.get(i)) * ((total - list.get(i)));
            max = Math.max(prod, max);
        }
        
        return (int) (max % mod);
    }
    public long postOrder(TreeNode root){
        if(root == null){
            return 0;
        }
		//fetch the left subtree sum
        long leftChild = postOrder(root.left);
		//fetch the right subtree sum
        long rightChild = postOrder(root.right);
        long curSum = leftChild+ rightChild  + root.data;
		//record the current subtree sum
        list.add(curSum);
        return curSum;
        
    }
}
