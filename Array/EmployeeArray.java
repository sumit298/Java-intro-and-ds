import java.util.Scanner;


public class EmployeeArray{
    String name;
    int age;
    int salary;
    static int top = 0;
    
    public void menu() {
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
            addEmployee();
            menu();
            break;
        case 2:
            displayEmployee();
            menu();
            break;
        case 3:
            deleteEmployee();
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

    public  void addEmployee() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter name");
            name = scan.nextLine();
            System.out.println("Enter age");
            age = scan.nextInt();
            System.out.println("Enter salary");
            salary = scan.nextInt();
            
        }
        top++;
    }

    public void deleteEmployee(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the position to delete");
            int position = scan.nextInt();
            for(int i = position-1; i< top;i++){
                name = name + 1;
                age = age + 1;
                salary = salary + 1;

            }
        }
        top--;
    }

    public void displayEmployee(){
        System.out.println("/ID\tName\t\tAge\t\tSalary");
        for(int i = 0; i< top;i++){
            System.out.println(i+1+"\t"+name+"\t"+age+"\t"+salary);
        }
    }
    
    public static void main(String[] args) {
        EmployeeArray e = new EmployeeArray();
        e.menu();
    }

   

  
}