
public class QueueUsingArray {
    int front;
    int rear;
    int size;
    int data[];

    public QueueUsingArray() {
        front = -1;
        rear = -1;
        size = 0;
        data = new int[5];
    }

    int size() {
        return size;
    }

    void enqueue(int element) {
        if (size == data.length) {
            System.out.println("Queue Overflow");
            return;
        }
        if (size == 0) {
            front = 0; // only for first insertion
        }
        rear++;
        data[rear] = element;
        size++;

    }
    int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int element = data[front];
        front++;
        size--;
        return element;
    }
    // int dequeue() {
    //     int deletedElement;
    //     if (size == 0) {
    //         return 0;
    //     } else {
    //         deletedElement = data[front];
    //     }
    //     if(front > rear){
    //         front = -1;
    //         rear = -1;

    //     }
    //     else{

    //         front = front + 1;
    //     }
    //     System.out.println(deletedElement);
    //     return deletedElement;
    // }
    public void display(){
        for(int i = front; i <= rear; i++){
            System.out.println(data[i]);
        }
    }       
    // public void display() {
    //     if(size == 0){
    //         System.out.println("Queue is Empty");
    //     }
    //     for (int index = front; index <= rear; index++) {
    //         System.out.println(data[index]);
    //     }
    // }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}
