package QueueCollection;
import java.util.*;
import java.util.PriorityQueue;

public class PriorityQueueCollection {
    // PriorityQueue is a data structure that implements the Queue interface.
    // It is a data structure that stores elements in order of priority.
    // The elements in the queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time.
    // The head of the queue is the least element, and the tail of the queue is the greatest element.
    // The priority queue implementation is based on a binary heap.
    // The priority queue is implemented using an array.
    public static void main(String[] args) {
        Queue<Integer> minPq = new PriorityQueue<>();
        Queue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());        
        minPq.offer(40);
        minPq.offer(12);
        minPq.offer(24);
        minPq.offer(36);
        System.out.println(minPq);

        // poll() removes and returns the head of the queue.
        System.out.println(minPq.poll());
        System.out.println(minPq);
        
        // in min heap smallest element is at the top.
        // in max heap largest element is at the top.

        // peek() returns the head of the queue without removing it.
        System.out.println(minPq.peek());


        maxPq.offer(12);
        maxPq.offer(22);
        maxPq.offer(30);
        maxPq.offer(40);
        System.out.println(maxPq);
        System.out.println(maxPq.poll());
        System.out.println(maxPq);
        System.out.println(maxPq.peek());

    }
}


// What is comparator?
// Comparator is an interface that defines a method to compare two objects.
// The method returns a negative integer, zero, or a positive integer depending on whether the first argument is less than, equal to, or greater than the second.
// The Comparator interface is used to sort the elements of an array or collection.
// Ex. Comparator<Integer> c = new Comparator<Integer>() {
//     public int compare(Integer o1, Integer o2) {
//         return o1 - o2;
//     }
// };
// Arrays.sort(arr, c);
// Collections.sort(coll, c);

// how to convert minHeap into maxHeap
