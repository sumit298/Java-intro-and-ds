import SinglyLinkList.Node;

public class LinkList_Random_Node {
    int len = 0;
    Node headNode;
    public  LinkList_Random_Node(Node head){
        headNode = head;
        Node tempNode = head;
        while(tempNode!=null){
            len++;
            tempNode = tempNode.next;
        }
    }

    public int getRandom(){
        int rand_index = (int)(Math.random()*len);
        Node tempNode = headNode;
        while(rand_index>0){
            tempNode = tempNode.next;
            rand_index--;
        }
        return tempNode.data;
    }
}
