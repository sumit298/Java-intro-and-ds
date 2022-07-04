import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class SwapNodeInPairs {
    public static Node SwapPairs(Node head) {
        Node fast = head;
        Node current = head;
        Node prev = head;
        while (fast != null) {
            prev = fast;
            current = fast.next;
            fast = fast.next.next;
            current.next = prev;
            prev.next = fast;

        }
        return prev;
    }

    public static Node SwapPairs2(Node head) {
        Node DummyNode = new Node();
        Node prev = DummyNode;
        DummyNode.next = head;
        Node current = head;
        Node nextPair;
        Node second;
        while (current != null && current.next != null) {
            // storing pointer values
            nextPair = current.next.next;
            second = current.next;

            // changing pointers
            second.next = current;
            current.next = nextPair;
            prev.next = second;

            // updating pointers
            prev = current;
            current = nextPair;

        }
        return DummyNode.next;
    }

    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = SwapPairs2(head);
        LinkListUse.printLinkList(head);
    }
}
