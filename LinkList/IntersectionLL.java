import SinglyLinkList.Node;

public class IntersectionLL {
    public static Node intersectionOfLinkedList(Node headA, Node headB){
        if(headA==null || headB == null){
            return null;
            
        }
        Node resultNode = new Node();
        int countA = findLength(headA);

        int countB = findLength(headB);
        int result = 0;
        if(countA > countB){
            result = countA - countB;
            while(result > 0){
                headA = headA.next;
                result--;
            }
        }
        else if(countB > countA){
            result = countB - countA;
            while(result > 0){
                headB = headB.next;
                result--;
            }
        }
        while(headA != null && headB != null){
            if(headA!=headB){
                headA = headA.next;
                headB = headB.next;
            }
            else{
                resultNode = headA;
                break;
            }

            
        }
        
        // Return null if it does not find intersection
        
        return resultNode.next == null ? null : resultNode;

    }
    public static int findLength(Node head){
        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
    public static Node intersectioNodeOptimal(Node headA, Node headB){
        if(headA == null || headB == null){
            return null;
        }
        Node tempA = headA;
        Node tempB = headB;
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
            if(tempA == null && tempB == null){
                return null;
            }
            if(tempA == null){
                tempA = headB;
            }
            if(tempB == null){
                tempB = headA;
            }
        }
        return tempA;
        

    }
    public static void main(String[] args) {
        
    }
}
