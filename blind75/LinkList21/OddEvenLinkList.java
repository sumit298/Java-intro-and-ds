public class OddEvenLinkList{
    public static ListNode oddEvenLL(ListNode head){
        if(head == null){
            return head;
        }
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode hold = head.next;
        while(evenHead!=null && evenHead.next!=null){
            oddHead.next = evenHead.next;
            oddHead = oddHead.next;
            evenHead.next = oddHead.next;
            evenHead = evenHead.next;
        }
        oddHead.next = hold;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = LinkListOperations.createLinkList();
        head = oddEvenLL(head);
        LinkListOperations.printLinkList(head);
    }
}