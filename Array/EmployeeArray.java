import java.util.Scanner;

public class EmployeeArray{
    String name;
    int age;
    int salary;
    int top = 0;
    
    public static void menu() {
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add Employee ");
        System.out.println("2. Display Employee ");
        System.out.println("3. Delete Employee ");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        choice = scan.nextInt();
        
        switch (choice) {
        case 1:
            // addEmployee();
            menu();
            break;
        case 2:
            // displayEmployee();
            menu();
            break;
        case 3:
            // deleteEmployee();
            menu();
            break;
        case 4:
            System.exit(0);
            break;
        default:
            System.out.println("Invalid Choice");
            menu();
        }
        scan.close();
    }
    
    public static void main(String[] args) {
        menu();
    }

   

  
}