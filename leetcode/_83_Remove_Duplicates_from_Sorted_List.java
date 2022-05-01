import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class _83_Remove_Duplicates_from_Sorted_List {
    public static Node remove_duplicates_link_list(Node head){
        Node current = head;
        while(current!=null && current.next!=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = remove_duplicates_link_list(head);
        LinkListUse.printLinkList(head);
    }
}
