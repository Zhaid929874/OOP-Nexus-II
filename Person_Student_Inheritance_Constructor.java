class Person {

    public String name;
    public int age;

    public Person(String s, int a) {
        this.name = s;
        this.age = a;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    public String studentID;

    public Student(String s, int a, String i) {
        super(s, a);
        this.studentID = i;
    }

    public void displayStudentID() {
        System.out.println("StudentID: " + studentID);
    }
}

public class Person_Student_Inheritance_Constructor {

    public static void main(String[] args) {

        Student student = new Student("Zahid", 22, "0802410205101056");

        student.displayDetails();
        student.displayStudentID();
    }
}