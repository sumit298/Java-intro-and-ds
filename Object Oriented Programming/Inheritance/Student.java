public class Student extends inheritance {
    
    String surname = "Sinha";

    void display() {
        System.out.println("Name : " + surname + " " + name);
        System.out.println("Sex : " + sex);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
