package CircularLinkList;

import java.util.Scanner;

public class circularLinkList {
    public static CircularNode createCircularLinkList(){
        CircularNode head = new CircularNode();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nodes, to stop press -1");
        int value = scan.nextInt();
        while(value!=-1){
            CircularNode newNode  = new CircularNode();
            newNode.data = value;
            if(head.next==null){
                head.next = newNode;
            } 
            else{
                CircularNode temp = new CircularNode();
                while(temp.next!=null){
                    temp = temp.next;

                }
                temp.next = newNode;
            }
            value = scan.nextInt();
        }
        return head.next;
    }

    void display(CircularNode last) {
        CircularNode temp;
        if (last == null) {
            System.out.println("Link list is empty");
        }
        else{
            temp = last.next;
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }while(temp!=last.next);

        }
    }
    public static CircularNode insertAtBeginning(CircularNode last){
        CircularNode newNode = new CircularNode();
        if(last == null){
            last = newNode;
            last.next = last;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
        }
        return last;
    } 
    public static CircularNode insertAtMiddle(CircularNode head, int position){
        CircularNode newNode =  new CircularNode();
        if(head==null){
            return null;
        }
        Scanner scan = new Scanner(System.in);
        position = scan.nextInt();
        int count = 0;
        CircularNode temp = head;
        while(count<position-1 && temp.next!=null){
            temp = temp.next;
            count++;
        }
        

        return head.next;
    }   
}