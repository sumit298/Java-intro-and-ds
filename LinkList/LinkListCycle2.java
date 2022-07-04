import SinglyLinkList.Node;

public class LinkListCycle2 {
    public static Node LLCycle(Node head) {
        Node fast_pointer = head;
        Node slow_pointer = head;
        boolean isCycle = false;
        while (fast_pointer != null && fast_pointer.next != null) {
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
            if (slow_pointer == fast_pointer) {
                isCycle = true;
                break;
            }

        }
        if (isCycle == false) {
            return null;
        }
        // initialize a fast_pointer from the head move both slow_pointer where cycle
        // detected and fast_pointer from the start till they do not meet.
        while (fast_pointer != slow_pointer) {
            fast_pointer = fast_pointer.next;
            slow_pointer = slow_pointer.next;

        }
        return slow_pointer;
    }

    public static void main(String[] args) {

    }
}

// Tortoise and Hare Algorithm Approach
// Hashset Approach Problem: Space Complexity will be more.
