import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class _21_Merge_two_link_lists {
    public Node mergeTwoLists(Node list1, Node list2) {
        Node list3 = new Node();
        Node temp = list3;
        while(list1 != null && list2 != null){
            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 == null){
            temp.next = list2;
        }else{
            temp.next = list1;
        }
        return list3.next;
    }
    public static void main(String[] args) {
        _21_Merge_two_link_lists obj = new _21_Merge_two_link_lists();
        Node list1 = LinkListUse.createLinkList();
        Node list2 = LinkListUse.createLinkList();
        Node result = obj.mergeTwoLists(list1, list2);
        LinkListUse.printLinkList(result);
    }
}


// Approach 1: Brute force Method
// Make a new list
// store head of the link list in temp
// continue till list1 and list2 is not empty then 
// compare if list1.data < list2.data then insert list1.data in list3
// else insert in list2.data in list3
// increment by list3 = list3.next in both cases
// if either of any one list got null then automatically insert all the remaining elemets of list in list3.
// return head of the list3.
