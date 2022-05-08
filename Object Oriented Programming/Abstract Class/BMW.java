public class BMW extends Cars {
    // Now bmw can implement getCompany or become abstract itself.

    // Because car is implementing a constructor and bmw is extending it so it has
    // to implement this constructor
    BMW(int numGears, int maxSpeed) {
        super(numGears, maxSpeed);
    }

    @Override
    String getCompanyName() {
        return "BMW";
    }
    //Now you can make objects of bmw but not of cars and vehicles.
}
