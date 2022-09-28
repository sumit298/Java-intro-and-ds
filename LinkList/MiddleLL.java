import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class MiddleLL {
    public static Node middleofLL1(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public static Node middleofLL2(Node head){
        Node midPrev = null;
        while(head!=null && head.next!=null){
            midPrev = midPrev == null ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public static void main(String[] args) {
        Node head = LinkListUse.takeInput();
        head = middleofLL2(head);
        LinkListUse.printLinkList(head);

    }
}
