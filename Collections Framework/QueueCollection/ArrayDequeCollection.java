package QueueCollection;
import java.util.*;
public class ArrayDequeCollection {
    // Applications of ArrayDeque:
    // 1. Sliding window Questions (max, min, median, etc.) - where we need to keep track of the last k elements.
    // 2. Queue - where we need to keep track of the last k elements.
    // 3. Stack - where we need to keep track of the last k elements.
    // 4. Deque - where we need to keep track of the last k elements.
    // 5. Priority Queue - where we need to keep track of the last k elements.
    // 6. Binary Search Tree - where we need to keep track of the last k elements.
    
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<10; i++) {
            deque.offer(i);
        }
        
        deque.peekFirst();
        deque.offerFirst(5);
        deque.offerLast(44);
        System.out.println(deque);

        deque.poll(); // remove the first element
        System.out.println(deque);

        deque.pollLast(); // remove the last element
        System.out.println(deque);

        deque.pollFirst(); // remove the first element
        System.out.println(deque);
        // difference between peek() and peekFirst() is that peek() returns the element at the head of the queue,
        // and peekFirst() returns the element at the head of the queue, but does not remove it.

        // difference between peek and poll is that peek returns the element at the head of the queue,
        // and poll returns the element at the head of the queue and removes it.
    }
}
