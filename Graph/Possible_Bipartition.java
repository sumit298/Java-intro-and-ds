import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Possible_Bipartition{
    // bipartite means that the graph can be divided into two sets
    // such that no two nodes in the same set are connected
    // and every node in the graph is connected to at least one node in the other set

    // this is a graph coloring problem where we need to color the graph with two colors
    // such that no two adjacent nodes have the same color

    //Apprach: Graph Coloring + DFS
    //Time: O(N+E)
    //Space: O(N+E)
    static ArrayList<Integer>[] graph;
    static Map<Integer, Integer> color;

    public static boolean possibleBipartiton(int N, int [][]dislikes){
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge: dislikes){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        color = new HashMap<>();
        for(int node=1; node<=N; node++){
            if(!color.containsKey(node) && !dfs(node, 0)){
                return false;
            }
        }
        return true;
    }

    
    public static boolean dfs(int node, int c){
        if(color.containsKey(node)){
            return color.get(node) == c;
        }
        color.put(node, c);
        for(int nei: graph[node]){
            if(!dfs(nei, c^1)){
                return false;
            }
        }
        return true;
    }


    public boolean possibleBipartition2(int N, int[][] dislikes) {
        int[][] graph = new int[N][N];
        for (int[] d : dislikes) {
            graph[d[0] - 1][d[1] - 1] = 1;
            graph[d[1] - 1][d[0] - 1] = 1;
        }
        int[] group = new int[N];
        for (int i = 0; i < N; i++) {
            if (group[i] == 0 && !dfs2(graph, group, i, 1)) {
                return false;
            }
        }
        return true;
    }
    private boolean dfs2(int[][] graph, int[] group, int index, int g) {
        group[index] = g;
        for (int i = 0; i < graph.length; i++) {
            if (graph[index][i] == 1) {
                if (group[i] == g) {
                    return false;
                }
                if (group[i] == 0 && !dfs2(graph, group, i, -g)) {
                    return false;
                }
            }
        }
        return true;
    }


}


// This code appears to implement a depth-first search (DFS) algorithm to determine whether it is possible to partition a group of N individuals into two groups such that any individual dislikes another individual, the two individuals are in different groups.

// The input to the algorithm is the number of individuals (N) and an array of dislikes, where each element is an array containing the indices of two individuals who dislike each other. The function possibleBipartition2() first constructs a graph representation of the dislikes, where the graph is represented as an adjacency matrix. An entry in the matrix is set to 1 if the two individuals corresponding to the row and column indices dislike each other, and 0 otherwise.

// The function then initializes an array "group" to store the group assignment for each individual (1 for the first group, -1 for the second group). It then starts a DFS from each unvisited node (individual) and assigns the node to the first group. The function dfs2() is called to traverse the graph and assign the group labels. If a node is encountered that has already been assigned to the same group, the function returns false, as this indicates that it is not possible to partition the individuals into two groups satisfying the given conditions. If a node is encountered that has not been visited, the function assigns it to the opposite group and continues the search. If the function is able to visit all nodes and assign group labels without finding a conflict, it returns true, indicating that it is possible to partition the individuals into two groups satisfying the given conditions.


// The approach used in this code is to represent the dislikes between individuals as an adjacency matrix, where each entry in the matrix represents the relationship between two individuals. The algorithm then performs a depth-first search (DFS) on this graph to determine whether it is possible to partition the individuals into two groups such that any two individuals who dislike each other are in different groups.

// To implement this approach, the code first defines a function possibleBipartition2() that takes in the number of individuals (N) and an array of dislikes as input. The function first constructs an adjacency matrix representation of the dislikes, where an entry in the matrix is set to 1 if the two individuals corresponding to the row and column indices dislike each other, and 0 otherwise. The function then initializes an array "group" to store the group assignment for each individual (1 for the first group, -1 for the second group).

// Next, the function starts a DFS from each unvisited node (individual) and assigns the node to the first group. It does this by calling the function dfs2(), which is responsible for traversing the graph and assigning group labels to the nodes it visits. The dfs2() function takes in the adjacency matrix, the "group" array, the index of the current node, and the group label as input.

// The dfs2() function first assigns the group label to the current node in the "group" array. It then iterates over the neighbors of the current node and checks if the neighbor has already been assigned to the same group. If it has, the function returns false, as this indicates that it is not possible to partition the individuals into two groups satisfying the given conditions. If the neighbor has not been visited, the function assigns it to the opposite group and continues the search by calling itself recursively on the neighbor. If the function is able to visit all nodes and assign group labels without finding a conflict, it returns true, indicating that it is possible to partition the individuals into two groups satisfying the given conditions.

// Finally, the possibleBipartition2() function checks the return value of dfs2() for each individual and returns false if any of the calls to dfs2() return false. Otherwise, it returns true, indicating that it is possible to partition the individuals into two groups satisfying the given conditions.


// public boolean possibleBipartition2(int N, int[][] dislikes) {
//     int[][] graph = new int[N][N];
//     for (int[] d : dislikes) {
//         graph[d[0] - 1][d[1] - 1] = 1;
//         graph[d[1] - 1][d[0] - 1] = 1;
//     }
// This code defines the function possibleBipartition2(), which takes in the number of individuals (N) and an array of dislikes as input. It creates a 2D array "graph" with dimensions N x N to represent the dislikes between individuals as an adjacency matrix. It then iterates over the array of dislikes and sets the entries in the adjacency matrix to 1 if the two individuals corresponding to the row and column indices dislike each other, and 0 otherwise.

//     int[] group = new int[N];
//     for (int i = 0; i < N; i++) {
//         if (group[i] == 0 && !dfs2(graph, group, i, 1)) {
//             return false;
//         }
//     }
// This code initializes an array "group" to store the group assignment for each individual (1 for the first group, -1 for the second group). It then starts a DFS from each unvisited node (individual) by calling the function dfs2() and passing in the adjacency matrix, the "group" array, the index of the current node, and the group label as input. If dfs2() returns false, the function possibleBipartition2() immediately returns false, as this indicates that it is not possible to partition the individuals into two groups satisfying the given conditions.

// private boolean dfs2(int[][] graph, int[] group, int index, int g) {
//     group[index] = g;
//     for (int i = 0; i < graph.length; i++) {
//         if (graph[index][i] == 1) {
//             if (group[i] == g) {
//                 return false;
//             }
//             if (group[i] == 0 && !dfs2(graph, group, i, -g)) {
//                 return false;
//             }
//         }
//     }
//     return true;
// }
// This is the implementation of the dfs2() function, which is responsible for traversing the graph and assigning group labels to the nodes it visits. The function takes in the adjacency matrix, the "group" array, the index of the current node, and the group label as input.

// The function first assigns the group label to the current node in the "group" array. It then iterates over the neighbors of the current node and checks if the neighbor has already been assigned to the same group. If it has, the function returns false, as this indicates that it is not possible to partition the individuals into two groups satisfying the given conditions. If the neighbor has not been visited, the function assigns it to the opposite group and continues the search by calling itself recursively on the neighbor. If the function is able to visit all nodes and assign group labels without finding a conflict, it returns true, indicating that it is possible to partition the individuals into two groups satisfying the given conditions.