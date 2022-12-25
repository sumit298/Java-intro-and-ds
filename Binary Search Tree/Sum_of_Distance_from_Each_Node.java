import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum_of_Distance_from_Each_Node{
    public static int[] sumOfDistancesInTree(int n, int edges[][]){
        int[] res = new int[n];
        int[] count = new int[n];
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        dfs(0, -1, graph, count, res);
        dfs2(0, -1, graph, count, res);
        return res;
    }
    private static void dfs(int node, int parent, List<Set<Integer>> graph, int[] count, int[] res) {
        for (int child : graph.get(node)) {
            if (child == parent) continue;
            dfs(child, node, graph, count, res);
            count[node] += count[child];
            res[node] += res[child] + count[child];
        }
        count[node]++;
    }
    private static void dfs2(int node, int parent, List<Set<Integer>> graph, int[] count, int[] res) {
        for (int child : graph.get(node)) {
            if (child == parent) continue;
            res[child] = res[node] - count[child] + count.length - count[child];
            dfs2(child, node, graph, count, res);
        }
    }
    

    
    
    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{2,3},{2,4},{2,5}};
        int[] res = sumOfDistancesInTree(6, edges);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}

// This code is calculating the sum of distances from every node in a tree to all other nodes in the tree. It does this using a combination of depth-first search (DFS) and dynamic programming.

// The sum of distances from a node to all other nodes in the tree is defined as the sum of the distances from that node to each of the other nodes.

// The code consists of two DFS functions: dfs and dfs2. The dfs function performs a DFS traversal of the tree and calculates two values for each node:

// count[node]: the number of nodes in the subtree rooted at node (including node itself).
// res[node]: the sum of distances from node to all other nodes in the subtree rooted at node.
// The dfs2 function uses the values calculated by dfs to compute the sum of distances from each node to all other nodes in the tree. It does this by using the following formula:

// res[child] = res[node] - count[child] + (n - count[child])

// Where n is the total number of nodes in the tree and count[child] is the number of nodes in the subtree rooted at child.

// The first DFS traversal calculates the sum of distances within the subtree rooted at each node, while the second DFS traversal uses this information to calculate the sum of distances from each node to all other nodes in the tree.


// why there is 2 dfs needed
// There are two DFS functions in this code because the first DFS function calculates the sum of distances within the subtree rooted at each node, while the second DFS function uses this information to calculate the sum of distances from each node to all other nodes in the tree.

// The first DFS function performs a DFS traversal of the tree and calculates the sum of distances within the subtree rooted at each node using a bottom-up approach. It does this by starting at the leaves of the tree and working its way up to the root. As it traverses the tree, it calculates the sum of distances from each node to all other nodes in its subtree and stores the result in the res array.

// The second DFS function, on the other hand, uses a top-down approach to calculate the sum of distances from each node to all other nodes in the tree. It starts at the root of the tree and works its way down to the leaves. As it traverses the tree, it uses the values calculated by the first DFS function to compute the sum of distances from each node to all other nodes in the tree.

// The reason why two DFS functions are needed is because the sum of distances from a node to all other nodes in the tree depends on the sum of distances within the subtree rooted at that node, as well as the sum of distances within the subtrees rooted at its children. The first DFS function calculates the sum of distances within each subtree, while the second DFS function uses this information to calculate the sum of distances from each node to all other nodes in the tree.




// how it is using dynamic programming
// Dynamic programming is a technique for solving problems by breaking them down into smaller subproblems, solving each subproblem once, and storing the solutions to these subproblems to avoid having to solve them again in the future.

// In this code, dynamic programming is being used to calculate the sum of distances from each node to all other nodes in the tree. The sum of distances from a node to all other nodes in the tree can be computed using the following formula:

// res[node] = res[child] + count[child] + res[node]

// Where res[child] is the sum of distances from child to all other nodes in the subtree rooted at child, and count[child] is the number of nodes in the subtree rooted at child.

// The first DFS function uses this formula to calculate the sum of distances within the subtree rooted at each node in a bottom-up manner, starting at the leaves of the tree and working its way up to the root. As it traverses the tree, it stores the results in the res array, so that it can use them to calculate the sum of distances from each node to all other nodes in the tree.

// By storing the solutions to the smaller subproblems (i.e., the sum of distances within each subtree), the second DFS function is able to avoid having to recalculate these values and instead use the stored solutions to compute the sum of distances from each node to all other nodes in the tree. This is what makes it an example of dynamic programming.how it is using dynamic programming
// Dynamic programming is a technique for solving problems by breaking them down into smaller subproblems, solving each subproblem once, and storing the solutions to these subproblems to avoid having to solve them again in the future.

// In this code, dynamic programming is being used to calculate the sum of distances from each node to all other nodes in the tree. The sum of distances from a node to all other nodes in the tree can be computed using the following formula:

// res[node] = res[child] + count[child] + res[node]

// Where res[child] is the sum of distances from child to all other nodes in the subtree rooted at child, and count[child] is the number of nodes in the subtree rooted at child.

// The first DFS function uses this formula to calculate the sum of distances within the subtree rooted at each node in a bottom-up manner, starting at the leaves of the tree and working its way up to the root. As it traverses the tree, it stores the results in the res array, so that it can use them to calculate the sum of distances from each node to all other nodes in the tree.

// By storing the solutions to the smaller subproblems (i.e., the sum of distances within each subtree), the second DFS function is able to avoid having to recalculate these values and instead use the stored solutions to compute the sum of distances from each node to all other nodes in the tree. This is what makes it an example of dynamic programming.


// The sumOfDistancesInTree function takes in two parameters:

// n: the number of nodes in the tree.
// edges: a 2D array containing the edges of the tree. Each row of the array represents an edge and consists of two integers edge[0] and edge[1], which are the indices of the nodes connected by the edge.
// The function first initializes two arrays:

// res: an array of size n that will be used to store the sum of distances from each node to all other nodes in the tree.
// count: an array of size n that will be used to store the number of nodes in the subtree rooted at each node.
// It also initializes a list of sets called graph, which will be used to represent the tree. Each set in the list represents the children of a node in the tree.

// The function then loops through the edges of the tree and adds them to the graph list. For each edge edge[0] and edge[1], it adds edge[1] to the set of children of edge[0] and vice versa. This creates a representation of the tree as an adjacency list.

// The function then calls the dfs function, passing in the following arguments:

// node: the root of the tree (0).
// parent: a value of -1, which represents a null parent (since there is no parent of the root).
// graph: the adjacency list representation of the tree.
// count: the array that will be used to store the number of nodes in the subtree rooted at each node.
// res: the array that will be used to store the sum of distances from each node to all other nodes in the tree.
// The dfs function performs a DFS traversal of the tree and calculates the sum of distances within the subtree rooted at each node. It does this by looping through the children of the current node and calling itself recursively on each child. As it traverses the tree, it calculates the sum of distances from each node to all other nodes in its subtree and stores the result in the res array. It also calculates the number of nodes in the subtree rooted at each node and stores the result in the count array.

// Once the dfs function has finished its traversal of the tree, the dfs2 function is called, with the same arguments as dfs. The dfs2 function uses the values calculated by dfs to compute the sum of distances from each node to all other nodes in the tree. It does this by using the following formula:

// res[child] = res[node] - count[child] + (n - count[child])

// Where n is the total number of nodes in the tree and count[child] is the number of nodes in the subtree rooted at child.

// The dfs2 function then calls itself recursively on each child of the current node, using the same formula to calculate the sum of distances from each child to all other nodes in the tree.

// Once the dfs2 function has finished its traversal of the tree, the sumOfDistancesInTree function returns the res array,