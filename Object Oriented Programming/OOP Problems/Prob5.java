class Student5 {
    String name;
    int rollno;

    // Constructor which we created not a default constructor
    Student5(int num) {
        rollno = num;
    }

    public void print() {
        System.out.println(name + " " + rollno);
    }
}

public class Prob5 {
    public static void main(String[] args) {
        Student5 s1 = new Student5(55);
        s1.rollno = 23;
        s1.print();
    }
}

// There is Compilation error - “constructor Student() is undefined” because the
// default constructor is available only till the point we don’t create our own
// constructor. So Student class has only one constructor which require roll
// number as argument, hence we should pass integer as argument while creating
// any Student object.
