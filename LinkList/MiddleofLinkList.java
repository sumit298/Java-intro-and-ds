import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class MiddleofLinkList {
    public static Node linkListMiddle(Node head){
        Node slow_pointer = head;
        Node fast_pointer = head;
        while(fast_pointer!=null && fast_pointer.next!=null){
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
        }
        return slow_pointer;
    }
    public static Node MiddleLinkList(Node head){
        Node midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = MiddleLinkList(head);
        LinkListUse.printLinkList(head);
        
    }
}