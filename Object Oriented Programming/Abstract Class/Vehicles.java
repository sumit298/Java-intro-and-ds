public abstract class Vehicles {
    protected String color;
    private int maxSpeed;

    Vehicles(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor");
    }

    int getMaxSpeed() {
        return maxSpeed;
    }

    abstract boolean isMotorized();

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void print() {
        System.out.println(color + " " + maxSpeed);
    }
}
