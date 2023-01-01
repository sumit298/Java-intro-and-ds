import java.util.ArrayList;
import java.util.List;

public class All_Paths_From_Source_To_Target {
    public static List<List<Integer>> allPathSourceTarget(int graph[][]){

        int n = graph.length;
        List<List<Integer>> res = new ArrayList<>();
        // one dimension arraylist to store the path
        List<Integer> path = new ArrayList<>();
        path.add(0);
        // dfs consist of graph, source, destination, path, result
        dfs(graph, 0, n-1, path, res);
        return res;

    }

    public static void dfs(int graph[][], int src, int dest, List<Integer> path, List<List<Integer>> res){
        if(src == dest){
            res.add(new ArrayList<>(path));
            return;
        }
        // nbr is the neighbour of the source
        // to find the neighbour of the source, we need to iterate through the graph
        for(int nbr : graph[src]){
            path.add(nbr);
            dfs(graph, nbr, dest, path, res);
            path.remove(path.size()-1);
        }
    }
}
