import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

// Approach: Approach: Below is the idea to solve the problem:

// To rotate the linked list, we need to change the next pointer of kth node to NULL, the next pointer of the last node should point to the previous head node, and finally, change the head to (k+1)th node. So we need to get hold of three nodes: kth node, (k+1)th node, and last node. 
// Traverse the list from the beginning and stop at kth node. store k’s next in a tem pointer and point k’s next to NULL then start traversing from tem and keep traversing till the end and point end node’s next to start node and make tem as the new head.

// Follow the below steps to implement the idea:

// Initialize a count variable with 0 and pointer kthnode pointing to Null and current pointing to head node.
// Move from current till k-1 and point kthnode to current’s next and current’t next to NULL.
// Move current from kth node to end node and point current’s next to head.

public class RotateList {
    public static Node rotateList(Node head, int k) {
        if (k == 0 || head == null) {
            return head;
        }

        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        temp.next = head;
        k = k % count;
        int jumps = count - k;
        temp = head;
        while (jumps > 0) {
            temp = temp.next;
            jumps--;
        }
        Node returnHead = temp.next;
        temp.next = null;
        return returnHead;
    }

    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = rotateListStriver(head, 2);
        // head = reverseList(head);
        LinkListUse.printLinkList(head);
    }

    public static Node rotateListByReversing(Node head, int k) {
        if (k == 0 || head == null) {
            return head;

        }
        Node entire = reverseList(head);
        // break the list into k parts
        Node temp = entire;
        int count = 0;
        while (count < k - 1) {
            temp = temp.next;
            count++;
        }
        Node kthNode = temp;
        Node kPlusOneNode = temp.next;
        temp.next = null;
        Node firstHalf = reverseList(entire);
        Node secondHalf = reverseList(kPlusOneNode);
        kthNode.next = secondHalf;
        return firstHalf;

    }

    public static Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        Node temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static Node rotateListStriver(Node head, int k) {
        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        current.next = head;
        if (length > k) {
            k = k % length;
        }

        current.next = head;
        k = length - k;
        while (k > 0) {
            current = current.next;
            k--;
        }
        head = current.next;
        current.next = null;

        return head;
    }
}
