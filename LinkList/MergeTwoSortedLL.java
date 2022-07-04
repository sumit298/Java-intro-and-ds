import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class MergeTwoSortedLL {
    public static Node MergeTwoSortedLinkList(Node list1, Node list2){
        // without tail
        Node head = new Node();
        Node cur = head;
        while(list1 != null && list2 != null){
            if(list1.data <= list2.data){
                cur.next = list1;
                list1 = list1.next;
            }
            else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 != null){
            cur.next = list1;
        }
        else{
            cur.next = list2;
        }
        return head.next;

    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    // with tail
    public static Node MergeTwoSortedLinkListWithTail(Node list1, Node list2){
        Node head = new Node();
        Node cur = head;
        Node tail = new Node();
        while(list1 != null && list2 != null){
            if(list1.data <= list2.data){
                cur.next = list1;
                list1 = list1.next;
            }
            else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 != null){
            cur.next = list1;
        }
        else{
            cur.next = list2;
        }
        cur = cur.next;
        cur.next = tail;
        return head.next;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        Node head1 = LinkListUse.createLinkList();
        Node head2 = LinkListUse.createLinkList();
        Node head = MergeTwoSortedLinkList(head1, head2);
        LinkListUse.printLinkList(head);
    }
}
