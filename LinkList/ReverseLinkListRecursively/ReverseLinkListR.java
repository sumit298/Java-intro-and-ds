package ReverseLinkListRecursively;

import SinglyLinkList.Node;

public class ReverseLinkListR {
    public static Node reverseLLRecursively(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node ReverseHead = reverseLLRecursively(head.next);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        ReverseHead.next = head;
        head.next = null;
        return head;
    }
    public static void main(String[] args) {
        
    }
}
