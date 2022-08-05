import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class LinkList_length {
    public static void length_of_linklist(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("The length of LinkList is " + count);
    }

    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        length_of_linklist(head);
        LinkListUse.printLinkList(head);
        System.out.println("Hello World");
        
        
     }
    
}
