package TypesoFInheritance;

class Vehicle {
    String model;
    String color;
    int wheels;

    void print() {

        System.out.println(model + " " + color + " " + wheels);
    }
}

class Bus extends Vehicle {
    Bus() {
        model = "Volvo";
        color = "blue";
        wheels = 4;

    }

    
}

class Bicycle extends Bus {
    void getBicycle(){

        super.model="Avon";super.color="grey";super.wheels=2;
    }

    

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.print();
        b.getBicycle();
        b.print();

    }
}
