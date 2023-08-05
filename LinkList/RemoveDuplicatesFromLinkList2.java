import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class RemoveDuplicatesFromLinkList2 {
    public static Node deleteDuplicates(Node head){
        if(head == null || head.next == null){
            return head;
        }

        // for deleting the first node
        Node pseudoNode = new Node();
        pseudoNode.next = head;

        Node current = pseudoNode;
        while(current.next!=null && current.next.next!=null){
            if(current.next.data == current.next.next.data){
                int variable = current.next.data;
                while(current.next!=null &&current.next.data == variable){
                    current.next = current.next.next;
                }
            }
            else{
                current = current.next;
            }
        }
        return pseudoNode.next;
    }

    public static void main(String[] args) {
        Node head = LinkListUse.takeInput();
        head = deleteDuplicates(head);
        LinkListUse.printLinkList(head);
    }

}
