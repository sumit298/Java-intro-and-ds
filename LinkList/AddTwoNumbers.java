import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class AddTwoNumbers {
    public static Node addTwoNumbers(Node num1, Node num2) {
        Node list1 = reverseIterative(num1);
        Node list2 = reverseIterative(num2);
        Node list3 = new Node();
        int carry = 0;
        Node head = list3;
        while (list1 != null && list2 != null) {
            int value = list1.data + list2.data + carry;
            carry = value / 10;
            list3.next = new Node();
            list3.next.data = value % 10;
            list3 = list3.next;
            list1 = list1.next;
            list2 = list2.next;
        }
        while (list1 != null) {
            int value = list1.data + carry;
            carry = value / 10;
            list3.next = new Node();
            list3.next.data = value % 10;
            list3 = list3.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            int value = list2.data + carry;
            carry = value / 10;
            list3.next = new Node();
            list3.next.data = value % 10;
            list3 = list3.next;
            list2 = list2.next;
        }
        if (carry == 1) {
            list3.next = new Node();
            list3.next.data = carry;
        }
        return reverseIterative(head.next);
    }

    public static Node reverseNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node reverseHeadTail = head.next;
        Node reverseHead = reverseNode(head.next);
        reverseHeadTail.next = head;
        head.next = null;
        return reverseHead;
    }

    public static Node reverseIterative(Node head) {
        Node current = head;
        Node prev = null;
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
        Node list1 = LinkListUse.createLinkList();
        Node list2 = LinkListUse.createLinkList();
        Node list3 = addTwoNumbers(list1, list2);
        LinkListUse.printLinkList(list3);


    }
}
