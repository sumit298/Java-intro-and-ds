import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

// Not completed
public class _2_Add_Two_Numbers {
    public static Node addTwoNumber(Node h1, Node h2) {
        Node reverseHead1 = reverseLL(h1);
        Node reverseHead2 = reverseLL(h2);
        Node list3 = new Node();
        int carry = 0;
        Node head = list3;
        while (reverseHead1 != null && reverseHead2 != null) {
            int value = reverseHead1.data + reverseHead2.data + carry;
            carry = value / 10;
            list3.next = new Node();
            list3.next.data = value % 10;
            reverseHead1 = reverseHead1.next;
            reverseHead2 = reverseHead2.next;
            list3 = list3.next;

        }
        while (reverseHead1 != null) {
            int value = reverseHead1.data + carry;
            carry = value / 10;
            list3.next = new Node();
            list3.next.data = value % 10;
            reverseHead1 = reverseHead1.next;
            list3 = list3.next;
        }

        while (reverseHead2 != null) {
            int value = reverseHead2.data + carry;
            carry = value / 10;
            list3.next = new Node();
            list3.next.data = value % 10;
            reverseHead2 = reverseHead2.next;
            list3 = list3.next;
        }
        if (carry == 1) {
            list3.next = new Node();
            list3.next.data = carry;
        }
        return reverseLL(head.next);

    }

    public static Node reverseLL(Node head) {
        Node prev = null;
        Node current = head;
        Node temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head1 = LinkListUse.createLinkList();
        Node head2 = LinkListUse.createLinkList();
        Node head = addTwoNumber(head1, head2);
        LinkListUse.printLinkList(head);
    }
}
