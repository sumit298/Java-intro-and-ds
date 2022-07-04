
import SinglyLinkList.LinkListUse;
import SinglyLinkList.Node;

public class Merge_K_Sorted_LinkList {
    // You are given an array of k linked-lists lists, each linked-list is sorted in
    // ascending order.

    // Merge all the linked-lists into one sorted linked-list and return it.

    // Example 1:

    // Input: lists = [[1,4,5],[1,3,4],[2,6]]
    // Output: [1,1,2,3,4,4,5,6]
    // Explanation: The linked-lists are:
    // [
    // 1->4->5,
    // 1->3->4,
    // 2->6
    // ]
    // merging them into one sorted list:
    // 1->1->2->3->4->4->5->6
    // Example 2:

    // Input: lists = []
    // Output: []
    // Example 3:

    // Input: lists = [[]]
    // Output: []

    // Constraints:

    // k == lists.length
    // 0 <= k <= 104
    // 0 <= lists[i].length <= 500
    // -104 <= lists[i][j] <= 104
    // lists[i] is sorted in ascending order.
    // The sum of lists[i].length will not exceed 104.
    public static Node mergeKLists(Node[] lists) {
        if(lists.length == 1){
            return lists[0];
        }
        if(lists.length == 0){
            return null;
        }
        Node head = mergeTwoLists(lists[0], lists[1]);
        for(int i=2; i<lists.length; i++){
            head = mergeTwoLists(head, lists[i]);
        }

        return head;
    }

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dummyNode = new Node();
        Node current = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                // increment list1 pointer
                list1 = list1.next;
            } else {
                current.next = list2;
                // increment list2 pointer
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return dummyNode.next;

    }
    // Time Complexity: O(nlogk)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        Node head1 = LinkListUse.createLinkList();
        LinkListUse.printLinkList(head1);
        Node head2 = LinkListUse.createLinkList();
        LinkListUse.printLinkList(head2);
        Node head3 = LinkListUse.createLinkList();
        LinkListUse.printLinkList(head3);
        Node[] lists = new Node[3];
        lists[0] = head1;
        lists[1] = head2;
        lists[2] = head3;
        Node head = mergeKLists(lists);
        LinkListUse.printLinkList(head);


    }

}

// Approaches:
// 1. Just traverse all the link list means one end connect to another head and
// so on.
// and at last sort the link list.
// Complexity: K lists of n length + sort (nlogn) ==> O(k*n);
// 2. Merge two sorted lists at a time. first merge two lists and then merge the
// result with the third list and so on.
// Time Complexity: O(n*log(k))
// 3. Divide and Conquer: Divide the lists into two halves and merge them. Then
// merge the
// two halves and so on.
// Time Complexity: O(k*n)
// 4. Heap: Create a heap and add all the lists to the heap. Then pop the top
// element from the heap and add it to the result. Then add the next element to
// the heap. And so on.
// Time Complexity: O(k*n)
// 5. Optimal Solution: Use a min heap to store the minimum element of all the
// lists. Then pop the top element and add it to the result. This is the optimal
// solution.