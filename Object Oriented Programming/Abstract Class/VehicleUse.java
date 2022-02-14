public class VehicleUse {
    public static void main(String[] args) {
        // Vehicles v = new Vehicles(100); // object cannot be created as Vehicle class
        // is abstract
        Cars c = new Cars(4, 200); // But car class completed method isMotorized so we can make car class object.
        c.color = "Blue";

        c.print();
    }
}
