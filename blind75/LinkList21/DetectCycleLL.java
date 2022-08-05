public class DetectCycleLL {
    public static boolean isDetectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static ListNode detectCycleBeginning(ListNode head) {
        ListNode fast = head, slow = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                isCycle = true;
            }
        }
        if (isCycle == false) {
            return null;
        }
        fast = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
