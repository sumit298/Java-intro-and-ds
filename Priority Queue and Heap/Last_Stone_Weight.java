import java.util.PriorityQueue;

public class Last_Stone_Weight {
    public static int lastStoneWeight(int []weight){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        for(int w: weight){
            pq.add(w);
        }
        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();
            if(y>x){
                pq.add(y-x);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }


    public static int lastStoneWeight2(int []weight){
    // Create a priority queue with a custom comparator that compares the weights of two stones and returns the difference between them.
    // This ensures that the heaviest stones will have the highest priority in the queue.
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
    
    // Add all the stones from the input array to the priority queue.
    for(int w: weight){
        pq.add(w);
    }
    
    // Enter a loop that continues until there is only one stone left in the queue.
    while(pq.size()>1){
        // Remove the two heaviest stones from the queue.
        int y = pq.poll();
        int x = pq.poll();
        
        // If the stone with weight y is heavier than the stone with weight x, add the difference between their weights back to the queue.
        // Otherwise, both stones are discarded.
        if(y>x){
            pq.add(y-x);
        }
    }
    
    // Return the weight of the last stone in the queue. If the queue is empty, return 0.
    return pq.isEmpty() ? 0 : pq.poll();
  }
    public static void main(String[] args) {
        int []weight = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(weight));
        System.out.println(lastStoneWeight2(weight));
    }
  
}

// This is a method that takes an array of integers as input and returns the weight of the last stone in a game of "Last Stone Weight".

// In this game, there are multiple stones with different weights. Players take turns removing any two stones of their choice and smashing them together. The stone with the higher weight is then retained, while the stone with the lower weight is removed from the game. The game continues in this manner until there is only one stone left.

// The method first creates a priority queue, which is a data structure that allows you to retrieve the element with the highest priority (in this case, the heaviest stone). The priority queue is initialized with a custom comparator that compares the weights of two stones and returns the difference between them. This ensures that the heaviest stones will have the highest priority in the queue.

// Next, the method adds all the stones from the input array to the priority queue. Then, it enters a loop that continues until there is only one stone left in the queue. In each iteration of the loop, the method removes the two heaviest stones from the queue, compares their weights, and retains the heavier stone while discarding the lighter one. If the two stones have the same weight, both are discarded.

// Finally, the method returns the weight of the last stone in the queue. If the queue is empty, it returns 0.

