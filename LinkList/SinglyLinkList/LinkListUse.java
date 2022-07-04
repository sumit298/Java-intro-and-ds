package SinglyLinkList;

import java.util.Scanner;

public class LinkListUse {

    public static void menu(Node head) {
        try (// Node head = new Node();
                Scanner scan = new Scanner(System.in)) {
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
                    printLinkList(head);
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
    }

    public static void insertMenu(Node head) {
        try (Scanner scan = new Scanner(System.in)) {
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
                    insertAtMiddle(head);
                    menu(head);
                    break;
                case 3:
                    InsertAtEnd(head);
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
    }

    public static void deleteMenu(Node head) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("1. DeleteAtBeginning");
            System.out.println("2. DeleteAtMiddle (Removing node at specific position");
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
                    deleleAtMiddle(head);
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
    }

    public static void printLinkList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " =====> ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static Node createLinkList() {
        Node head = new Node();
        Scanner scan = new Scanner(System.in);
        // For taking first Input
        System.out.println("Enter the Nodes, to stop press -1: ");
        int data = scan.nextInt();
        while (data != -1) {
            Node newNode = new Node();
            newNode.data = data;
            if (head.next == null) {
                head.next = newNode;
            } else {
                // Creating temp for iteration
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                // reaching last and joining to new node
                temp.next = newNode;
            }
            data = scan.nextInt();
        }

        // scan.close();
        return head.next;
    }

    public static Node takeInput() {
        Node head = new Node();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Nodes, to stop press -1: ");
        int data = scan.nextInt();
        while (data != -1) {
            Node newNode = new Node();
            newNode.data = data;
            if (head.next == null) {
                head.next = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = scan.nextInt();
        }
        return head.next;

    }

    public static Node insertAtStart(Node head) {
        // Node head = new Node();
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        return head;
        // scan.close();
    }

    public static void InsertAtEnd(Node head) {
        // Node head = new Node();
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        Node temp = head;
        if (head == null) {
            return;
            // return newNode
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Node Inserted At End");
        // scan.close();

    }

    public static void insertAtMiddle(Node head) {
        // Node head = new Node();
        Scanner scan = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter the position of linklist where you want to insert: ");
        int position = scan.nextInt();
        int data = scan.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        } else {
            // Create temp for iteration
            // Check count < position -1 && temp is not reached at null (for checking first
            // node)
            // iterate temp through there.
            // Increment the count.
            // phir newNode.next = temp.next ==> setting newNode address to next node
            // address
            // and then previous node (position -1) will contain address of this new node.
            Node temp = head;
            while (count < position - 1 && temp.next != null) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        System.out.println("Node Inserted At Middle at postion: " + position);
        // scan.close();

    }

    public static void searchLinkList(Node head) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the data you want to search: ");
        int data = scan.nextInt();
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == data) {
                System.out.println("Data Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data Not Found");
        // scan.close();
    }

    public static Node deleteAtBeginning(Node head) {
        head = head.next;
        System.out.println("First Node is deleted");
        return head;
    }

    public static void deleteAtLast(Node head) {
        // Node head = new Node();
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Last Node is deleted");
    }

    public static void deleleAtMiddle(Node head) {
        // Node head = new Node();
        Scanner scan = new Scanner(System.in);
        int posnum, count = 1;
        System.out.println("Enter the position which you want node to be deleted");
        posnum = scan.nextInt();
        Node temp = head;
        while (count < posnum - 1 && temp.next != null) {
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        System.out.println("Node deleted at position" + posnum);
        // scan.close();

    }

    public static void main(String[] args) {
        Node head = takeInput();
        Node head1 = takeInput();
        printLinkList(head1);
        printLinkList(head);

        // menu(head);

    }

    // why creating 2nd link list gives me No such element exception?
    // because it is creating a new link list and it is not pointing to the same
    // address.

}

// Why it is generating two separate link list on two calls?
// printLinkList(head);
// printLinkList(head);

// because in every function call main head and function printlinklist parameter
// head is totally different.
// woh function apna local head banakar traverse kar sare elements ko print kar
// ke destroy ho jaata hai.
//
// Same cheej dusre call me bhi hua.
// Issliye hume node null tak pahuch jaane ke baad bhi 2 output
// 10 20 30
// 10 20 30 dikhta hai.
// and this is the mistake of delete at beginning and insert at beginning.
// you have to return head.
