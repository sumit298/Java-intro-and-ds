import java.util.HashSet;

import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class RemoveDuplicateFromUnSortedList {
    public static Node RemoveDuplicateFromUnsorted(Node head){
        HashSet<Integer> visited = new HashSet<>();
        Node current = head;
        Node prev = null;
        // Now traverse whole linkList
        while(current!=null){
            int value = current.data;
            // if value present in the map
            if(visited.contains(value)){
                prev.next = current.next;
            }
            else{
                visited.add(value);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = RemoveDuplicateFromUnsorted(head);
        LinkListUse.printLinkList(head);


        
    }
}
