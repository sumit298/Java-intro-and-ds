package SinglyLinkList;

public class DeleteFromMiddleLinkList {
    public static Node deletefromMiddle(Node head) {
        // find middle element
        // keep reference of previous of middle element.
        // and just delete middle with the help of previous
        Node slow_pointer = head;
        Node fast_pointer = head;
        Node prev = head;
        while (fast_pointer != null && fast_pointer.next != null) {
            fast_pointer = fast_pointer.next.next;
            prev = slow_pointer;
            slow_pointer = slow_pointer.next;
        }
        prev.next = slow_pointer.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = deletefromMiddle(head);
        LinkListUse.printLinkList(head);
    }
}
