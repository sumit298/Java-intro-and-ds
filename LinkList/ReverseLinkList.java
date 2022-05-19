import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class ReverseLinkList {
    

    public static Node reverseListIterative(Node head){

        return head;
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


    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = reverseListRecursive(head);
        LinkListUse.printLinkList(head);
    }
}
