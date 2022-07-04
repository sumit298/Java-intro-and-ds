import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class SumOfLinkList {
    public static int LinkListSum(Node head){
        int sum = 0;
        Node temp = head;
        while(temp!=null){
            sum = sum + temp.data;
            temp = temp.next;
        }
        return sum;
    }
    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        System.out.print("Sum of Link List: "+LinkListSum(head));
        
    } 
}
