public class MergeTwoLinkList {
    public static ListNode mergeTwoLL(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return head.next;

    }

    public static void main(String[] args) {
        ListNode l1 = LinkListOperations.createLinkList();
        ListNode l2 = LinkListOperations.createLinkList();
        ListNode head = mergeTwoLL(l1, l2);
        LinkListOperations.printLinkList(head);
    }
}
