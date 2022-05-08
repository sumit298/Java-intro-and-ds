import java.util.Scanner;
public class Dijkstra_Algorithm{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total no of vertices");
        int totalVertices = scan.nextInt();
        System.out.println("Enter total no of edges");
        int edges = scan.nextInt();
        int adjacencyMatrix[][] = new int[totalVertices][totalVertices];
        for(int i=0; i<edges; i++){
            int startPath = scan.nextInt();
            int endPath = scan.nextInt();
            int weight = scan.nextInt();

            adjacencyMatrix[startPath][endPath] = weight;
            adjacencyMatrix[endPath][startPath] = weight;
        } 

        DijkstraAlgo(adjacencyMatrix);
    }

    private static void DijkstraAlgo(int[][] adjacencyMatrix) {
        int v = adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        for(int i=1; i<v; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        // Iterations for v-1 vertex
        for(int i=0; i<v-1; i++){
            // find Min Vertex at first it will return 0
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            // Explore its neighbours
            for(int j=0; j<v; j++){
                if(adjacencyMatrix[minVertex][j]!=0 && !visited[j] && distance[minVertex]!=Integer.MAX_VALUE){
                    int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
                    if(newDist< distance[j]){
                        distance[j] = newDist;
                    }

                }

            }
        }

        // print 
        System.out.println("======Result======");
        for(int i=1; i<v; i++){
            System.out.println(i + " " + distance[i]);
        }
    }

    private static int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for(int i=0; i< distance.length;i++){
            if(!visited[i] && (minVertex == -1 || distance[i]< distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }
}

