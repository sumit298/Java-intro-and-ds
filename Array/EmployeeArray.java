// import java.util.Scanner;

public class EmployeeArray {
    String data[][];
    int index;

    public EmployeeArray() {
        data = new String[30][20];
        index = -1;

    }

    void push(String element) {
        if (index > data.length) {
            System.out.println("Array is full");
            return;
        }
        index++;
        // data[index] = element;
    }

    void pop(int position) {
        if (index < 0) {
            System.out.println("Array is empty");
            return;
        }
        for(int i=position; i < data.length-1;i++){
            data[i] = data[i+1];
        }
        // int deletedElement = data[index];
        index = index - 1;
        // return deletedElement;

    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        EmployeeArray employee = new EmployeeArray();
        employee.push("1");
        employee.push("2");
        employee.push("3");
        employee.push("4");
        // employee.push(5);
        employee.pop(2);
        employee.display();

    }
}
