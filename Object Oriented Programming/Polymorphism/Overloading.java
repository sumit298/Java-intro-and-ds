
public class Overloading{
    String name;
    int rollno;
    int marks1, marks2, marks3;
    void printDetails(String name){
        
        System.out.println(name);
    }
    void printDetails(String name, int rollno){
        System.out.println(rollno + " " + name);
    }

    void printDetails(String name, int rollno, int marks1, int marks2, int marks3){
        int total = marks1 + marks2 + marks3;
        System.out.println(rollno + " " + name + " " + total);
    }
    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        o1.printDetails("Sumit");
        o1.printDetails("Ravi", 25);
        o1.printDetails("Pankaj", 26, 95, 92, 91);
    }
}