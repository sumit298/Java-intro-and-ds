package ReverseLinkListRecursively;

import DoublyLinkList.DoubleNode;
import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class ReverseRecursivelyDoubleNode {
    public static DoubleNode reverseR(Node head){
        if(head==null || head.next==null){
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;

        }
        DoubleNode DoubleReverseHead = reverseR(head.next);
        DoubleReverseHead.tail.next = head;
        head.next = null;
        DoubleNode ans = new DoubleNode();
        ans.head = DoubleReverseHead.head;
        ans.tail = head;
        return ans;

    }
    public static void main(String[] args) {
        Node head = LinkListUse.createLinkList();
        DoubleNode doublehead = reverseR(head);
        LinkListUse.printLinkList(doublehead.head);
    }
    // TimeComplexity: O(n)
    // Space Complexity: O(1)
}
