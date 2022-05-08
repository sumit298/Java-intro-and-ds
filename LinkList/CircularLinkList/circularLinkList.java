package CircularLinkList;

public class circularLinkList {
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
        return last;
    }
}