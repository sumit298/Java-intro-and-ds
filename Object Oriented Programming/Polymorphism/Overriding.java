import java.util.Scanner;

class Vehicle {
    String model;
    String color;
    int wheels;
    void print() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter model of the vehicle");
        model = scan.nextLine();
        System.out.println("Enter color of vehicle");
        color = scan.nextLine();
        System.out.println("Enter no of wheels");
        wheels = scan.nextInt();
        System.out.println(model + " " + color + " " + wheels);
    }
}

class Bus extends Vehicle {
    int speed;
    void print() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter model of the Bus:");
        super.model = scan.nextLine();
        System.out.println("Enter color of the Bus:");
        super.color = scan.nextLine();
        System.out.println("Enter no of wheels in the bus:");
        super.wheels = scan.nextInt();
        System.out.println("Enter bus's speed:");
        speed = scan.nextInt();
        System.out.println(model + " " + color + " " + wheels +" " + speed);
    }
}



public class Overriding {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        // Calling method of Vehicle class
        v.print();
        Bus b = new Bus();
        // Calling method of Bus class
        b.print();
    }
}