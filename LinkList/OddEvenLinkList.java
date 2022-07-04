import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class OddEvenLinkList {
    public static Node oddEvenLL(Node head){
        if(head==null){
            return null;

        }
        Node OddHead = head;
        Node EvenHead = head.next;
        Node Hold = head.next;
        while(EvenHead!=null && EvenHead.next!=null){
            OddHead.next = EvenHead.next;
            OddHead = OddHead.next;
            EvenHead.next = OddHead.next;
            EvenHead = EvenHead.next;
        }
        OddHead.next = Hold;
        return head;
        
        
    }
    public static Node OddEvenLL2ndApproach(Node head){
        Node OddHead = head;
        Node EvenHead = head.next;
        Node temp = head;
        int index = 1;
        while(temp!=null && temp.next!=null){
            if(index%2==0){
                EvenHead.next = temp;
                EvenHead = EvenHead.next;
            }
            else {
                OddHead.next = temp;
                OddHead = OddHead.next;
                
            }
            temp = temp.next;
            index++;
        }
        while(OddHead.next!=null){
            OddHead = OddHead.next;
        }
        OddHead.next = EvenHead;
        return OddHead;
        
    }
    
    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = oddEvenLL(head);
        LinkListUse.printLinkList(head);
    }
}
