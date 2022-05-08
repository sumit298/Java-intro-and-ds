class Student4 {
    String name;
    int rollNo;

    Student4(int num) {
        rollNo = num;
    }

    public void print() {
        System.out.println(name + " " + rollNo);
    }
}

public class Prob4 {
    public static void main(String[] args) {
        Student4 s1 = new Student4(12);
        s1.print();
        // Null 12
    }
}

// Constructor is called when an object is created, here when we create a
// Student object coressponding student object is created and rollNo is assigned
// to 12, whereas name is assigned null (as default value for String data member
// is null). So output is null 12
