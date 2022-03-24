public class VehicleUse {
    public static void main(String[] args) {
        // Vehicles v = new Vehicles(100); // object cannot be created as Vehicle class
        // is abstract
        BMW b = new BMW(4, 200); // But car class completed method isMotorized so we can make car class object.
        b.color = "Blue";

        b.print();
    }
}
