import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        this.next = null;
    }
}

public class LinkListOperations {
    public static ListNode createLinkList() {
        ListNode head = new ListNode();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the data, to stop press -1");
        int data = scan.nextInt();
        while (data != -1) {
            ListNode newNode = new ListNode();
            newNode.val = data;
            if (head.next == null) {
                head.next = newNode;
            } else {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = scan.nextInt();
        }

        return head.next;
    }

    public static void printLinkList(ListNode head) {
        if (head == null) {
            System.out.println("Link list is empty");
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ===> ");
            temp = temp.next;
        }

    }

}
