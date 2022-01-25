package DoublyLinkList;

import java.util.Scanner;

public class doublyLL {

    public static void menu(DoubleNode head) {
        // Node head = new Node();
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Insert In LinkList");
        System.out.println("2. Display LinkList");
        System.out.println("3. Delete LinkList");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        switch (choice) {

        case 1:
            insertMenu(head);
            break;
        case 2:
            displayMenu(head);
            menu(head);
            break;
        case 3:
            deleteMenu(head);
            break;
        case 4:
            System.exit(0);
            // break;
        default:
            System.out.println("Invalid Choice!");
            menu(head);
            break;
        }
        // scan.close();
    }

    public static void displayMenu(DoubleNode head) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Display");
        System.out.println("2. Display Reverse");
        System.out.println("3. Go to MainMenu");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        switch (choice) {
        case 1:
            displayLinkList(head);
            menu(head);
            break;
        case 2:
            displayInReverse(head);
            menu(head);
            break;
        case 3:
            menu(head);
            break;
        default:
            System.out.println("Invalid Choice!");
            menu(head);
            break;
        }

    }

    public static void insertMenu(DoubleNode head) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Insert At Beginning ");
        System.out.println("2. Insert At Middle(at specific position)");
        System.out.println("3. Insert At End");
        System.out.println("4. Go to MainMenu");
        System.out.println("Enter your choice");
        int insertMenuChoice = scan.nextInt();
        switch (insertMenuChoice) {
        case 1:
            head = insertAtStart(head);
            menu(head);
            break;
        case 2:
            head = insertAtMiddle(head);
            menu(head);
            break;
        case 3:
            InsertAtLast(head);
            menu(head);
            break;
        case 4:
            menu(head);
            // break;
        default:
            System.out.println("Invalid Choice");
            menu(head);
            break;
        }
        // scan.close();
    }

    public static void deleteMenu(DoubleNode head) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. DeleteAtBeginning");
        System.out.println("2. DeleteAtMiddle (Removing node at specific position)");
        System.out.println("3. DeleteAtEnd");
        System.out.println("4. Go to MainMenu");
        System.out.println("Enter your choice");
        int deleteMenuChoice = scan.nextInt();
        switch (deleteMenuChoice) {
        case 1:
            head = deleteAtBeginning(head);
            menu(head);
            break;
        case 2:
            head = deleteAtMiddle(head);
            menu(head);
            break;
        case 3:
            deleteAtLast(head);
            menu(head);
            break;
        case 4:
            menu(head);
            // break;
        default:
            System.out.println("Invalid Choice!");
            menu(head);

        }
        // scan.close();
    }

    public static DoubleNode createLinkList() {
        Scanner scan = new Scanner(System.in);
        DoubleNode head = null;
        System.out.println("Enter nodes, to stop press -1");
        int data = scan.nextInt();
        while (data != -1) {
            // Creation of new Node
            DoubleNode newNode = new DoubleNode(); // NewNode next and prev is null.
            newNode.data = data;
            if (head == null) {
                head = newNode;
            } else {
                DoubleNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.prev = temp;

            }
            data = scan.nextInt();
        }
        System.out.println("LinkList is created");
        return head;

    }

    public static DoubleNode createNode() {
        Scanner scan = new Scanner(System.in);
        DoubleNode newNode = new DoubleNode();
        System.out.println("Enter the Node: ");
        int data = scan.nextInt();
        newNode.data = data;
        return newNode;
    }

    public static DoubleNode insertAtStart(DoubleNode head) {
        // DoubleNode temp = head;
        DoubleNode newNode = createNode();
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        System.out.println("First Node is Inserted");
        return head;

    }

    public static void InsertAtLast(DoubleNode head) {
        DoubleNode temp = head;
        DoubleNode newNode = createNode();
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static DoubleNode insertAtMiddle(DoubleNode head) {
        Scanner scan = new Scanner(System.in);
        DoubleNode temp = head;
        DoubleNode newNode = createNode();
        System.out.println("Enter the position to insert");
        int position = scan.nextInt();
        int count = 1;
        if (position == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return head;
        }


        while (count < position - 1 && temp.next != null) {
            count++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        // newNode.next = temp.next; // NewNode next set
        // temp.next.prev = newNode; // after newNode previous will store newNode
        // address
        // temp.next = newNode; // temp next set.
        // newNode.prev = temp; // newNode prev set
        return head;
    }

    public static void displayLinkList(DoubleNode head) {
        DoubleNode temp = head;
        if (head == null) {
            System.out.println("Node is Empty");
            return;
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ===> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void displayInReverse(DoubleNode head) {
        DoubleNode temp = head;
        if (head == null) {
            System.out.println("Link List is Empty:");
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " <=== ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static DoubleNode deleteAtBeginning(DoubleNode head) {
        head = head.next;
        head.prev = null;
        System.out.println("First Node is deleted");
        return head;
    }

    public static void deleteAtLast(DoubleNode head) {
        DoubleNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Last Node is deleted");
    }

    public static DoubleNode deleteAtMiddle(DoubleNode head) {
        Scanner scan = new Scanner(System.in);
        DoubleNode temp = head;
        int count = 1;
        System.out.println("Enter the position u want to delete: ");
        int position = scan.nextInt();
        if (position == 0) {
            head = head.next;
            head.prev = null;

            return head;
        }
        // Issue: Last Node is not deleted.
        while (count < position - 1 && temp.next != null) {
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        System.out.println("Node is deleted at position " + position);
        return head;
    }

    public static void main(String[] args) {
        DoubleNode head = createLinkList();
        menu(head);

    }
}
