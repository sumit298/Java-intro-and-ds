class Student6 {
    String name;
    int rollno;

    // Constructor 1
    Student6(int num) {
        rollno = num;
        name = "abc";
    }

    // Constructor 2
    Student6(int num, String str) {
        rollno = num;
        name = str;
    }

    public void display() {
        System.out.println(name + " " + rollno);
    }

}

public class Prob6 {
    public static void main(String[] args) {
        Student6 s1 = new Student6(101);
        s1.display();
        Student6 s2 = new Student6(150, "xyz");
        s2.display();

        // abc 101
        // xyz 150
    }
}

// Explaination: when we create object of class Student6 with only one
// parameter,
// it will take default value for other parameter.
// when we create object of class Student6 with two parameters, it will take
// value of second parameter.
