package CustomClassHashSet;

public class StudentHashset implements Comparable<StudentHashset> {
    int rollNo;
    String name;
    StudentHashset(int rollno, String name){
        this.rollNo = rollno;
        this.name = name;
    }
    public void display(){
        System.out.println(rollNo + " " + name);
    };
    // What is @Override?
    // @Override is a compiler annotation that indicates that a method is overriding a method in a superclass.
    @Override
    public String toString() {
        return rollNo + " " + name;
    }

    // toString, equals, hashCode are all methods in Object class.
    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        StudentHashset s = (StudentHashset) obj;
        return s.rollNo == this.rollNo;
    }
    @Override
    public int hashCode() {
        return this.rollNo;
    }
    @Override
    public int compareTo(StudentHashset that) {
        return this.rollNo - that.rollNo;
    }
}
