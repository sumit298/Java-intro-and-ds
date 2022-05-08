public abstract class Cars extends Vehicles {
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

    // Car is not implementing getCompany() Method so declaring himself as abstract class.
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
