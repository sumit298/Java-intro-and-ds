public class MiddleOfLinkList {
    /*
     * My Method
     * You have to find middle of the linkList
     ! find m-1 element
     ? implement using faster and slower pointer
     */
    public static ListNode middleofLL(ListNode head){
        ListNode fast = head, slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = LinkListOperations.createLinkList();
        head = middleofLL(head);
        LinkListOperations.printLinkList(head);
    }
}
