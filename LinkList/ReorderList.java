import SinglyLinkList.Node;

public class ReorderList {
    public static void reorderlist(Node head){
        if(head == null) return;
        
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        Node prev = null;
        Node curr = second;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        second = prev;

        Node first = head;
        while(first != null && second != null){
            Node temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }



    }

    public static void reorderlistWithArray(Node head){
        if(head == null) return;
        
        // build array of nodes
        Node[] nodes = new Node[50000];
        int i = 0;
        while(head != null){
            nodes[i++] = head;
            head = head.next;
        }

        int j = i - 1;
        i = 0;
        while(i < j){
            nodes[i].next = nodes[j];
            i++;
            if(i == j) break;
            nodes[j].next = nodes[i];
            j--;
        }
        nodes[i].next = null;

    }
    public static void main(String[] args) {
        
    }
}
