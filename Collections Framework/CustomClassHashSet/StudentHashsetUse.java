package CustomClassHashSet;
import java.util.HashSet;
import java.util.Set;

public class StudentHashsetUse {
    public static void main(String[] args) {
        Set<StudentHashset> studentSet = new HashSet<>();
        studentSet.add(new StudentHashset(1, "John"));
        studentSet.add(new StudentHashset(2, "Mary"));
        studentSet.add(new StudentHashset(3, "Morty"));
        studentSet.add(new StudentHashset(4, "John"));
        studentSet.add(new StudentHashset(3, "Amanda")); //not added amanda because it's rollno is already in the set
        // print
        System.out.println(studentSet);

        // why it is allowing duplicates?
        // So it is checking only if two objects will be different only then it will consider different else consider same.
        // So it is checking if two objects are equal then it will consider same else different.


        // Now to prevent that in a class use equals method and override hashcode method.
        // So it will check if two objects are equal then it will consider same else different.

        studentSet.add(new StudentHashset(5, "John"));
        System.out.println(studentSet);
    }
}
