public class LinkListUse{
    public static void printLinkList(Node head){
        while(head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }


    }
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.next = node2;
        node2.next = node3;
        Node head = node1;
        printLinkList(head);
        printLinkList(head);
    }
}

// Why it is generating two separate link list on two calls?
// because in every function call main head and function printlinklist parameter head is totally different.
// woh function apna local head banakar traverse kar sare elements ko print kar ke destroy ho jaata hai.
// 
// Same cheej dusre call me bhi hua. 
// Issliye hume node null tak pahuch jaane ke baad bhi 2 output 
// 10 20 30
// 10 20 30 dikhta hai.


// Why array index starts from 0?
// Answer:
