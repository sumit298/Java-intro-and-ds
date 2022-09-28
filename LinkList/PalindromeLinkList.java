import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class PalindromeLinkList {
    public static boolean isPalindromeLL(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        // Find Middle of LinkList
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node reverseAfterMiddle = reverseLL(slow.next);
        slow.next = null;

        // Compare the two halves
        Node firstHalf = head;
        Node secondHalf = reverseAfterMiddle;
        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;

    }

    public static Node reverseLL(Node head) {
        Node prev = null;
        Node current = head;
        Node temp;
        while (current != null && current.next != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;

        }
        return current;
    }
    
    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        System.out.println(isPalindromeLL(head));
    }
}
