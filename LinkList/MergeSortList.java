import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class MergeSortList {
    public static Node sortList(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);
        
        return merge(left, right);
    }
    
    static Node merge(Node list1, Node list2){
        Node head = new Node();
        Node tail = head;
        
        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        
        tail.next = (list1 != null) ? list1 : list2;
        return head.next;
    }
    
    static Node getMid(Node head){
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
        head = sortList(head);
        LinkListUse.printLinkList(head);

    }
}

