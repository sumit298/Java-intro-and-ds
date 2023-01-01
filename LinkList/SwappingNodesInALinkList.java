import java.util.ArrayList;
import java.util.List;

import SinglyLinkList.Node;

public class SwappingNodesInALinkList {
    public static Node swapNodes(Node head, int k) {
        if (head == null)
            return null;
        Node temp = head;
        // Rebuilding link list
        Node temp2 = head;
        // transform the linklist to an array
        List<Integer> arr = new ArrayList<>();
        int size = 0;
        while (temp != null) {
            arr.add(temp.data);
            size++;
            temp = temp.next;
        }
        System.out.println(arr);
        // swap function
        swap(k - 1, size - k, arr);
        System.out.println(arr);
        int i = 0;
        while (temp2 != null) {
            temp2.data = arr.get(i);
            i++;
            temp2 = temp2.next;
        }
        return head;

    }

    private static void swap(int i, int j, List<Integer> arr) {

        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);

    }
}
