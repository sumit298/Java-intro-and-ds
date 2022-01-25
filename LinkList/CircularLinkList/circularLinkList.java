package CircularLinkList;

import java.util.Scanner;

public class circularLinkList {
    public static CircularNode createCircularLinkList() {
        CircularNode head = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nodes, to stop press -1");
        int data = scan.nextInt();
        while (data != -1) {
            CircularNode newNode = new CircularNode();
            newNode.data = data;
            if (head == null) {
                // Creation of new circular Node
                head = newNode;

            } else {
                // Creation of temp to iterate over head
                CircularNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;

            }
            data = scan.nextInt();

        }
        return head;
    }

    public static CircularNode displayLinkList(CircularNode head) {
        CircularNode temp = head;
        if (head == null) {
            System.out.println("Link List is Empty");
            
        } else {
            while (temp.next != head) {
                System.out.print(temp.data + " ==> ");
                temp = temp.next;
            }
        }
        return head;
    }

    public static CircularNode deleteAtBegining(CircularNode head) {
        CircularNode temp = head;
        while (temp != head) {
            temp = temp.next;
        }
        temp.next = head;
        head = head.next;
        return head;
    }

    public static void deleteAtLast(CircularNode head) {
        CircularNode temp = head;
        while (temp != head) {
            temp = temp.next;
        }
        

    }
    
    public static void main(String[] args) {
        CircularNode head = createCircularLinkList();
        head = displayLinkList(head);
    }
}