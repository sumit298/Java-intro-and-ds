import java.util.ArrayList;
import java.util.List;

public class Find_If_path_Exists_In_Graph {
    public static boolean validPath(int n, int edges[][], int source, int destination){
        // convert edges to adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());

        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);


        }
        // dfs
        boolean[] visited = new boolean[n];
        return dfs(adjList, visited, source, destination);
    }

    private static boolean dfs(List<List<Integer>> adjList, boolean[] visited, int source, int destination) {
        if (source == destination) {
            return true;
        }
        visited[source] = true;
        for (int neighbor : adjList.get(source)) {
            if (!visited[neighbor]) {
                if (dfs(adjList, visited, neighbor, destination)) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Explain the code:
// 1. The code is to find if there is a path between two nodes in a graph.
// 2. The code is to convert the edges to adjacency list.
// 3. The code is to do dfs to find if there is a path between two nodes.
// 4. The code is to return true if there is a path between two nodes.
// 5. The code is to return false if there is no path between two nodes.

// dfs explanation:
// 1. The code is to check if the source is the destination.
// 2. The code is to mark the source as visited.
// 3. The code is to check if the source has any neighbor.
// 4. The code is to check if the neighbor is visited.
// 5. The code is to check if there is a path between the neighbor and the destination.
// 6. The code is to return true if there is a path between the neighbor and the destination.
// 7. The code is to return false if there is no path between the neighbor and the destination.

// time complexity: O(n)
// space complexity: O(n)
