import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class ReverseLinkList {
    

    public static Node reverseListIterative(Node head){
        Node current = head;
        Node previous = null;
        Node temp;
        while(current!=null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public static Node reverseListRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node Reversehead = reverseListRecursive(head.next);
        Node temp = Reversehead;
        while(temp.next!=null){
            temp = temp.next;

        }
        temp.next = head;
        head.next = null;
        return Reversehead;
    }
    public static Node reverseListRecursive2(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node firstTail = head.next;
        Node Reversehead = reverseListRecursive2(head.next);
        firstTail.next = head;
        head.next = null;
        return Reversehead;
    }


    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = reverseListRecursive2(head);
        LinkListUse.printLinkList(head);
    }
}
