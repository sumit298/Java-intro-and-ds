import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

// Not completed
public class _2_Add_Two_Numbers {
    public static Node addTwoNumber(Node h1, Node h2) {
        Node temp1 = h1;
        Node temp2 = h2;
        Node result = new Node();
        Node resultCurrent = result;
        while (temp1.next != null && temp2.next != null) {
            if (temp1.data + temp2.data > 10) {
                resultCurrent.next.data = temp1.data + temp2.data + 1;

            } else {
                resultCurrent.data = temp1.data + temp2.data;
                resultCurrent = resultCurrent.next;

            }
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        return result;

    }

    public static void main(String[] args) {
        Node head1 = LinkListUse.createLinkList();
        Node head2 = LinkListUse.createLinkList();
        Node head = addTwoNumber(head1, head2);
        LinkListUse.printLinkList(head);
    }
}
