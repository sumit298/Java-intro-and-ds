import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setRollNumber(121);
        s1.setName("Sumit");
        s2.setRollNumber(141);
        s2.setName("Manisha");
        System.out.println(s1.getRollNumber() + " " + s1.getName());
        System.out.println(s2.getRollNumber() + " " + s2.getName());
        scan.close();

    }
}
