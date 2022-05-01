import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class _206_Reverse_Link_List {
    public static Node ReverseRecursive(Node head){
        if(head == null || head.next== null){
            return head;
        }

        Node finalHead = ReverseRecursive(head.next);
        Node temp = finalHead;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return finalHead;
    }

    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = ReverseRecursive(head);
        LinkListUse.printLinkList(head);
    }
}
