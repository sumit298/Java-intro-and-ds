public class Student {
    private String name;
    private int rollNumber; // private access modifier

    // Get Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    } 
    // Getter
    public int getRollNumber() {
        return rollNumber;
    }
    // Setter

    public void setRollNumber(int rollNumber) {
        if(rollNumber <= 0){
            return;
        }
        this.rollNumber = rollNumber;
    }
}
