import java.util.Scanner;

public class LinkListHeap {
    Node head = null;
    Node temp = null;
    Node next = null;

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Insert LinkList");
        System.out.println("2. Display LinkList");
        System.out.println("3. Delete LinkList");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        switch (choice) {
        case 1:
            insertMenu();
            break;
        case 2:
            display();
            break;
        case 3:
            deleteMenu();
            break;
        case 4:
            System.exit(0);
            // break;
        default:
            System.out.println("Invalid Choice!");
            break;
        }
    }

    public static void insertMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Insert At Beginning ");
        System.out.println("2. Insert At Middle(at specific position)");
        System.out.println("3. Insert At End");
        System.out.println("4. Go to MainMenu");
        System.out.println("Enter your choice");
        int insertMenuChoice = scan.nextInt();
        switch (insertMenuChoice) {
        case 1:
            insertAtBeginning();
            break;
        case 2:
            insertAtMiddle();
            break;
        case 3:
            insertAtEnd();
            break;
        case 4:
            menu();
            // break;
        default:
            System.out.println("Invalid Choice");
            break;
        }
    }

    public static void deleteMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. DeleteAtBeginning");
        System.out.println("2. DeleteAtMiddle (Removing node at specific position");
        System.out.println("3. DeleteAtEnd");
        System.out.println("4. Go to MainMenu");
        System.out.println("Enter your choice");
        int deleteMenuChoice = scan.nextInt();
        switch (deleteMenuChoice) {
        case 1:
            deleteAtBeginning();
            break;
        case 2:
            deleteAtMiddle();
            break;
        case 3:
            deleteAtEnd();
            break;
        case 4:
            menu();
            // break;
        default:

        }
    }

    public static void display() {
        
    }

    public static void insertAtBeginning() {

    }

    public static void insertAtMiddle() {

    }

    public static void insertAtEnd() {

    }

    public static void deleteAtBeginning() {

    }

    public static void deleteAtMiddle() {

    }

    public static void deleteAtEnd() {

    }

    public static void main(String[] args) {
        menu();
    }

    // Ready - Running
    // Running - block
    // Running - End
    // Block - Running

    // Make 3 New Heads
}