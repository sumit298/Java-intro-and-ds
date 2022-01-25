import java.util.Scanner;
// This program is not working perfectly as i tried but not have time to fix it. So I am uploading as it is.
// TODO: Dry run once more.
// You can make a new menu function.
// Use precise names for variables.
// Can add for ascending order and descending order names.
public class PhoneBookUse{
    public static PhoneBookNode createContacts(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to add: ");
        int numofContacts = scan.nextInt();
        PhoneBookNode head = null;
        for(int i = 0; i < numofContacts; i++){
            PhoneBookNode newNode = new PhoneBookNode();
            System.out.println("Enter the name of the contact: ");
            newNode.name = scan.next();
            System.out.println("Enter the phone number of the contact: ");
            newNode.number = scan.nextLong();
            if(head == null){
                head = newNode;
            }else{
                // whil
                PhoneBookNode temp = head;
                temp.right = newNode;
                temp.right.left = temp;
                temp = temp.right;
            }
        }
        return head;
    }

    public static PhoneBookNode addContact(PhoneBookNode root){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the contact: ");
        String name = scan.next();
        System.out.println("Enter the phone number of the contact: ");
        long number = scan.nextLong();
        PhoneBookNode newNode = new PhoneBookNode();
        newNode.name = name;
        newNode.number = number;
        if(root == null){
            root = newNode;
        }else{
            PhoneBookNode temp = root;
            while(temp.right != null){
                temp = temp.right;
            }
            temp.right = newNode;
            newNode.left = temp;
            newNode.right = null;
        }
        return root;
    }
    public static void display(PhoneBookNode root){
        PhoneBookNode temp = root;
        while(temp != null){
            System.out.println(temp.name + " " + temp.number);
            temp = temp.right;
        }
    }

    public static PhoneBookNode search(PhoneBookNode root, String name){
        PhoneBookNode temp = root;
        while(temp != null){
            if(temp.name.equals(name)){
                return temp;
            }
            temp = temp.right;
        }
        return null;
    }

    public static PhoneBookNode delete(PhoneBookNode root, String name){
        PhoneBookNode temp = root;
        while(temp != null){
            if(temp.name.equals(name)){
                if(temp.left == null && temp.right == null){
                    temp = null;
                    
                }else if(temp.left == null){
                    temp.right.left = null;
                    temp = temp.right;
                }else if(temp.right == null){
                    temp.left.right = null;
                    temp = temp.left;
                }else{
                    PhoneBookNode temp2 = temp.right;
                    while(temp2.left != null){ 
                        temp2 = temp2.left;
                    }
                    temp2.left = temp.left;
                    temp.left.right = temp2;
                    temp = temp2;
                }
            }
            temp = temp.right;
        }
        return root;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PhoneBookNode root = null;
        int choice = 0;
        while(choice != -1){
            System.out.println("1. Create Contacts");
            System.out.println("2. Add Contact");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Delete");
            System.out.println("6. Print Ascending Order");
            System.out.println("7. Print Descending Order");
            System.out.println("-1. Exit");
            choice = scan.nextInt();
            switch(choice){
                case 1: 
                    root = createContacts();
                    break;
                case 2:
                    root = addContact(root);
                    break;
                case 3:
                    display(root);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact: ");
                    String name = scan.next();
                    PhoneBookNode temp = search(root, name);
                    if(temp != null){
                        System.out.println(temp.name + " " + temp.number);
                    }else{
                        System.out.println("Contact not found");
                    }
                    break;
                case 5:
                    System.out.println("Enter the name of the contact: ");
                    name = scan.next();
                    root = delete(root, name);
                    break;
                default:
                    break;
            }
        }
    }
}


