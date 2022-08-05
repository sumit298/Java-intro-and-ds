package QueueCollection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    // Queue is First-In-First-Out (FIFO) data structure.
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // System.out.println(queue.element());
        for (int i = 10; i <= 100; i += 10) {
            queue.offer(i); // add element at the end of the queue.
        }
        System.out.println(queue);
        System.out.println("Size of queue: " + queue.size()); // size of queue.
        System.out.println("Peek: " + queue.peek()); // peek at the first element of the queue.
        System.out.println(queue.poll()); // remove and return the first element of the queue.
        System.out.println(queue);
    }
}

// difference between add and offer:
// add: add element at the end of the queue. if successful return true. if not successful throws exception. 
// offer: add element at the end of the queue. if successful return true. if not successful return false.


// difference between peek and element:
// element: return the first element of the queue. if queue is empty, throws exception.
// peek: return the first element of the queue. if queue is empty, return null.

// difference between poll and remove:
// poll: remove and return the first element of the queue. if queue is empty, return null.
// remove: remove and return the first element of the queue. if queue is empty, throws exception.
