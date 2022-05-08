import java.util.Scanner;

public class QueueUsingArray {
    int front;
    int rear;
    int size;
    String process[];

    public QueueUsingArray() {
        front = -1;
        rear = -1;
        size = 0;
        process = new String[10];
    }

    int size() {
        return size;
    }

    void enqueue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of Process: ");
        String element = scan.nextLine();
        if (size == process.length) {
            System.out.println("Queue Overflow");
            return;
        }
        if (size == 0) {
            front = 0; // only for first insertion
        }
        rear++;
        process[rear] = element;
        size++;
        menu();

    }

    String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return "";
        }
        String element = process[front];
        front++;
        size--;
        menu();
        return element;
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(process[i] + " == ");
        }
        System.out.println();

        menu();
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Enqueue A Process");
        System.out.println("2. Dequeue Process");
        System.out.println("3. Display Current Processes");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = scan.nextInt();
        switch (choice) {
        case 1:

            enqueue();
            // menu();
        case 2:
            dequeue();
            // menu();
        case 3:
            display();
            // menu();
        case 4:
            System.exit(0);
        default:
            System.out.println("Invalid Choice!!");
            menu();
        }

    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        queue.menu();

    }
}
