import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Keys_And_Rooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // dfs
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, visited, 0);
        // check if all rooms are visited
        for (boolean visit : visited) {
            if (!visit) {
                return false;
            }
        }
        return true;
    }

    private static void dfs(List<List<Integer>> rooms, boolean[] visited, int source) {
        visited[source] = true;
        for (int neighbor : rooms.get(source)) {
            if (!visited[neighbor]) {
                dfs(rooms, visited, neighbor);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new LinkedList<>();
        rooms.add(new LinkedList<>());
        rooms.add(new LinkedList<>());
        rooms.add(new LinkedList<>());
        rooms.add(new LinkedList<>());
        rooms.add(new LinkedList<>());
        rooms.get(0).add(1);
        rooms.get(0).add(4);
        rooms.get(1).add(3);
        rooms.get(1).add(0);
        rooms.get(1).add(1);
        rooms.get(2).add(4);
        rooms.get(3).add(3);
        rooms.get(4).add(1);
        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRoomsAlishaApproach(List<List<Integer>> rooms){
        // creating visited rooms with all values false
        boolean visited[] = new boolean[rooms.size()];
        Queue<Integer> queue = new LinkedList<>();

        int n = rooms.get(0).size();
        // Entering first room
        for(int i=0; i<n; i++){
            queue.add(rooms.get(0).get(i));
        }

        visited[0] = true;

        // for all other values
        while(!queue.isEmpty()){
            int x = queue.peek();

            if(!visited[x]){
                int N = rooms.get(x).size();
                for(int i=0; i<N; i++){
                    // check if visited or not
                    if(!visited[rooms.get(x).get(i)]){
                        queue.add(rooms.get(x).get(i));
                    }
                }
                visited[x] = true;
            }
            queue.poll();
        }

        for(int i=0; i< visited.length; i++){
            if(!visited[i]){
                return false;
            }
        }

        return true;
    }

//     The first line declares an array visited of boolean values and initializes it to have the same size as the list of rooms. This array will be used to track which rooms have been visited.

// The second line declares a queue queue of integers and initializes it to be a linked list. This queue will be used to store the keys to be processed.

// The third line determines the number of keys in the first room. This value is stored in the variable n.

// The fourth line is a loop that iterates over all the keys in the first room. For each key, it adds it to the queue. This adds all the keys in the first room to the queue.

// The fifth line marks the first room as visited by setting the corresponding element in the visited array to true.

// The sixth line is the start of a loop that will continue until the queue is empty.

// The seventh line dequeues the first element x from the queue and stores it in a variable of the same name.

// The eighth line is an if statement that checks if room x has not been visited yet. If it has not, then the code within the if block is executed.

// The ninth line determines the number of keys in room x. This value is stored in the variable N.

// The tenth line is a loop that iterates over all the keys in room x. For each key, it checks if the corresponding room has not been visited yet. If it has not, then the key is added to the queue. This adds all the keys in room x to the queue.

// The eleventh line marks room x as visited by setting the corresponding element in the visited array to true.

// The twelfth line removes the first element from the queue.

// The thirteenth line is the end of the loop that continues until the queue is empty.

// The fourteenth line is the start of a loop that iterates over all the elements in the visited array.

// The fifteenth line is an if statement that checks if the current element has not been visited. If it has not, then the function returns false.

// The sixteenth line is the end of the loop that iterates over all the elements in the visited array.

// The seventeenth line is the end of the function and returns true. This indicates that all rooms have been visited.

// Overall, this code implements a breadth-first search (BFS) algorithm to determine if it is possible to visit all rooms in a given list of rooms. The algorithm begins by adding all the keys to the first room to the queue, marking the first room as visited, and then repeatedly dequeuing an element from the queue, adding all the keys in the corresponding room to the queue, and marking that room as visited. If the queue becomes empty, then all rooms have been visited and the function returns true. If any room has not been visited, then the function returns false.

    // with the help of queue
    public static boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        // bfs
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int source = queue.poll();
            visited[source] = true;
            for (int neighbor : rooms.get(source)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                }
            }
        }
        // check if all rooms are visited
        for (boolean visit : visited) {
            if (!visit) {
                return false;
            }
        }
        return true;
    }
}

// This is an implementation of a breadth-first search (BFS) algorithm in Java. The algorithm is designed to visit all the rooms in a given list of rooms and determine whether it is possible to visit every room from the starting room (room 0).

// The algorithm uses a queue to store the rooms that need to be visited and a boolean array to keep track of which rooms have been visited. It starts at room 0 and adds it to the queue and the visited array. It then repeatedly removes the first room from the queue, visits its neighbors (i.e., the rooms that are connected to it), and adds them to the queue if they have not already been visited. This continues until there are no more rooms left in the queue.

// After all the rooms have been visited, the algorithm checks whether all the rooms have been visited by iterating over the boolean array and returning false if any room has not been visited. If all the rooms have been visited, the algorithm returns true.

// This is just one possible way to implement a BFS algorithm in Java, and there are many other variations and optimizations that you can use. This example is intended to provide a basic understanding of the algorithm and how it might be implemented in Java.


// This is a method called canVisitAllRooms2() that takes a list of lists of integers as an argument and returns a boolean value. The method is implemented using a breadth-first search (BFS) algorithm.

// The first line of the method declares a boolean array called visited with the same number of elements as there are rooms in the list. This array will be used to keep track of which rooms have been visited.

// The second line declares a queue of integers called queue and initializes it using a linked list. This queue will be used to store the rooms that need to be visited.

// The third line adds room 0 to the queue. This is the starting room and the first room that will be visited.

// The next line is a while loop that continues until the queue is empty. Inside the loop, the first room in the queue is removed and stored in a variable called source. The room is then marked as visited by setting the corresponding element in the visited array to true.

// Next, the loop iterates over the neighbors of the current room (i.e., the rooms that are connected to it). For each neighbor, if it has not already been visited, it is added to the queue.

// After all the rooms have been visited, the loop ends and the method continues to the next block of code. This block of code iterates over the visited array and returns false if any room has not been visited. If all the rooms have been visited, the method returns true.

// This is the basic structure of the canVisitAllRooms2() method. It uses a BFS algorithm to visit all the rooms in the list and determine whether it is possible to visit every room from the starting room (room 0)