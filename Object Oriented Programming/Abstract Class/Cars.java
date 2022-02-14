public class Cars extends Vehicles {
    int numGears;
    boolean isConvertible;

    Cars(int numGears, int maxSpeed){
        super(maxSpeed);
        this.numGears = numGears;
        System.out.println("Car Constructor");
    }

    boolean isConvertible(){
        return isConvertible;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Car Gears : " + numGears);
        System.out.println("IsConvertible: " + isConvertible);
    }

    boolean isMotorized(){
        return false;
    }
}
