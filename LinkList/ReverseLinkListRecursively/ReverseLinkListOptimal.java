package ReverseLinkListRecursively;

import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class ReverseLinkListOptimal {
    public static Node reverseLLR(Node head){
        if(head==null || head.next == null){
            return head;
        }
        // Suppose by Reverse 10 20 30 40 by reverse it becomes 40 30 20 10
        // So by recursion part reverse will be 40 30 20
        // and I am keeping reference of the head.next which is 20. then after recursion I will make reference of 20.next = 10;
        // so i don't have to traverse the whole list again.
        Node ReverseListTail = head.next;
        Node ReverseHead = reverseLLR(head.next);
        ReverseListTail.next = head;
        head.next = null;
        return ReverseHead;
        
    }
    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        head = reverseLLR(head);
        LinkListUse.printLinkList(head);
        // TimeComplexity: O(n)
        // Space Complexity: O(1)
    }
}
