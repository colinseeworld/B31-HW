class Student{
    String name;
    int roll_no;

    public void display(){
        System.out.println("Student name is: " + name + "\nStudent roll number is: " + roll_no);
    }
}
public class StudentOne {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.roll_no = 2;

        student.display();
    }
}
