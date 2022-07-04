import SinglyLinkList.Node;
public class LinkListCycle {

    public static boolean containsLLCycle(Node head) {
        Node fast_pointer = head;
        Node slow_pointer = head;
        while (fast_pointer != null && fast_pointer.next != null) {
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
            if (slow_pointer == fast_pointer) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}