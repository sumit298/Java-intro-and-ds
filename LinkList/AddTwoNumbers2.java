import java.util.Stack;

import SinglyLinkList.LinkListUse;
// import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class AddTwoNumbers2 {
    // You are given two non-empty linked lists representing two non-negative
    // integers. The most significant digit comes first and each of their nodes
    // contains a single digit. Add the two numbers and return the sum as a linked
    // list.

    // You may assume the two numbers do not contain any leading zero, except the
    // number 0 itself.
    public static Node addTwoNumbers(Node l1, Node l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.data);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.data);
            l2 = l2.next;
        }

        int sum = 0;
        // int carry = 0;
        Node list = new Node();
        while (!stack1.empty() || !stack2.empty()) {
            if (stack1.empty())
                sum += stack1.pop();
            if (stack2.empty())
                sum += stack2.pop();

            list.data = sum % 10;
            Node head = new Node();
            head.data = sum / 10;
            head.next = list;
            list = head;
            sum /= 10;

        }
        return list.data == 0 ? list.next : list;
    }

    public static Node addTwoNum2(Node l1, Node l2){
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.data);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.data);
            l2 = l2.next;
        }
        
        int sum = 0;
        Node list = new Node();
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.data = sum % 10;
            Node head = new Node();
            head.data = sum / 10;
            head.next = list;
            list = head;
            sum /= 10;
        }
        
        return list.data == 0 ? list.next : list;
    }
    
    public static void main(String[] args) {
        Node head1 = LinkListUse.createLinkList();
        Node head2 = LinkListUse.createLinkList();
        Node result = addTwoNumbers(head1, head2);
        LinkListUse.printLinkList(result);
    }
}



// Approach: Use two stacks insert each node of the link list into their respective stacks.
// Take sum and pop items from stacks and create a new link list and put sum value in the new list value.
// Take care for carry by value % 10
// 