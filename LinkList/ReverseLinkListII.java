import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class ReverseLinkListII {
    public static Node ReverseLL2(Node head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        Node prev = null;
        Node tail = null;
        Node temp = null;
        Node dummyNode = new Node();
        prev = dummyNode;
        dummyNode.next = head;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        tail = prev.next;
        for (int i = 0; i < right - left; i++) {
            temp = prev.next;
            prev.next = tail.next;
            tail.next = tail.next.next;
            prev.next.next = temp;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = ReverseLL2(head, 2, 5);
        LinkListUse.printLinkList(head);
    }
}
