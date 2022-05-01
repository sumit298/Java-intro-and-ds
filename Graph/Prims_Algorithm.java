import java.util.Scanner;

public class Prims_Algorithm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total no of vertices: "); 
        int totalVertices = scan.nextInt();
        System.out.println("Enter the total no of Edges: ");
        int totalEdges = scan.nextInt();
        int adjacencyMatrix[][] = new int[totalVertices][totalVertices];
        for (int i = 0; i < totalEdges; i++) {
            int startPath = scan.nextInt();
            int endPath = scan.nextInt();
            int weight = scan.nextInt();
            // Because of undirected graph
            adjacencyMatrix[startPath][endPath] = weight;
            adjacencyMatrix[endPath][startPath] = weight;
        }

        prims(adjacencyMatrix);

    }

    public static void prims(int adjacencyMatrix[][]) {
        int v = adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int weight[] = new int[v];
        int parent[] = new int[v];

        // making first vertex weight =0;
        weight[0] = 0;
        // making values of other vertex as infinite
        parent[0] = -1;
        // taking i=1 becuase we already set weight of first vertex as 0
        for (int i = 1; i < v; i++) {
            weight[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < v; i++) {
            // Picking the vertex with min weight which is unvisited.
            int minVertex = findMinVertex(weight, visited); // v times
            // making sure that this vertex is now visited
            visited[minVertex] = true;

            // Exploring vertex neighbours
            // But how to check its neighbours
            // if there is edge weight then its vertex has its neighbour
            // otherwise it is not its neighbour
            for (int j = 0; j < v; j++) {  // v times
                if (adjacencyMatrix[minVertex][j] != 0 && !visited[j]) {
                    if (adjacencyMatrix[minVertex][j] < weight[j]) {

                        weight[j] = adjacencyMatrix[minVertex][j];
                        parent[j] = minVertex;
                    }
                }
            }

        }

        // for printing mst
        System.out.println("The Minimum spanning tree will be: ");
        System.out.println("V1" + " " + "V2" + " " + "W");
        for (int i = 1; i < v; i++) {
            if (parent[i] < i) {
                System.out.println(parent[i] + "  " + i + "  " + weight[i]);
            } else {
                System.out.println(i + " " + parent[i] + " " + weight[i]);
            }
        }

        // Total Cost path
        int totalWeight = 0;
        for (int i = 1; i < v; i++) {
            totalWeight += weight[i];
        }
        System.out.println("The total cost path is: " + totalWeight);

    }

    public static int findMinVertex(int[] weight, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < weight.length; i++) {
            if (!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }

}


// time complexity: O(V^2)
// Input flow:
// first give total no of nodes/vertices for ex: 6
// then give total no of edges in the graph for ex: 8
// then give relation between vertices edge and weight.
// remember graph numbering starts from zero.
// v1 v2 weight
// 0   1  4
// 0   2  6
// 1   2  9
// 1   3  4
// 2   4  8
// 3   4  7
// 3   5  6
// 4   5  4
 

