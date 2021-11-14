import java.util.Scanner;

public class LinkListUse {
    public static void printLinkList(Node head) {
        while (head != null) {
            System.out.print(head.data + " =====> ");
            head = head.next;
        }

    }

    public static Node createLinkList() {
        Node head = null;
        Scanner scan = new Scanner(System.in);
        // For taking first Input
        int data = scan.nextInt();
        while (data != -1) {
            Node newNode = new Node();
            newNode.data = data;
            if (head == null) {
                head = newNode;
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
        return head;
    }

   public static void insertAtStart(Node head) {
       Scanner scan = new Scanner(System.in);
         int data = scan.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public static void InsertAtEnd(Node head) {
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Node Inserted At End");

    }

    public static void insertAtMiddle(Node head){
        Scanner scan = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter the position of linklist where you want to insert: ");
        int position = scan.nextInt();
        int data = scan.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        if(head == null){
            head = newNode;
        }
        else{
            // Create temp for iteration
            // Check count < position -1 && temp is not reached at null (for checking first node)
            // iterate temp through there.
            // Increment the count.
            // phir newNode.next = temp.next ==> setting newNode address to next node address 
            // and then previous node (position -1) will contain address of this new node.
            Node temp = head;
            while(count < position -1 && temp.next != null){
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        System.out.println("Node Inserted At Middle at postion: " + position);


    }
    public static void main(String[] args) {
        // Node node1 = new Node(10);
        // Node node2 = new Node(20);
        // Node node3 = new Node(30);
        // node1.next = node2;
        // node2.next = node3;
        Node head = createLinkList();
        printLinkList(head);
        // insertAtStart(head);
        insertAtMiddle(head);
        printLinkList(head);
        InsertAtEnd(head);
        printLinkList(head);

    }
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
