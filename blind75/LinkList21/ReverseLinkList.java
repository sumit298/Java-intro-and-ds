public class ReverseLinkList {
    public static ListNode reverseLL(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;

        }
        return prev;
    }

    public static ListNode reverseLLRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode recursiveHeadTail = head.next;
        ListNode recursiveHead = reverseLLRecursive(head.next);
        recursiveHeadTail.next = head;
        head.next = null;
        return recursiveHead;
    }

    
    public static void main(String[] args) {
        // what is list
        ListNode head = LinkListOperations.createLinkList();
        head = reverseLLRecursive(head);
        LinkListOperations.printLinkList(head);
    }
}
