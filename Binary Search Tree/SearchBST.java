import java.util.Scanner;

public class SearchBST {

    public NodeBST search(NodeBST root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (root.data < key) {
            search(root.right, key);
        }
        return search(root.left, key);
    }

    public NodeBST insert(NodeBST root) {
        System.out.println("Enter the data to be inserted: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        NodeBST newNode = new NodeBST();
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            NodeBST current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
        return root;
    }

    public static NodeBST delete(NodeBST root){
        System.out.println("Enter the node to be deleted ");
        Scanner scan = new Scanner("System.in");
        int value = scan.nextInt();
        NodeBST current = root;
        NodeBST parent = null;

        

        return root;
    }

    public static void main(String[] args) {
        

    }
}
