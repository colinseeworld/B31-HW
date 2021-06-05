class Students{
    String name;
    int rollNumber;
    String phoneNumber;
    String address;

    public void display(){
        System.out.println("Student name is: " + name +
                "\nStudent roll number is: " + rollNumber +
                "\nStudent phone number is: " + phoneNumber +
                "\nStudent address is: " + address);
    }
}
public class StudentTwo {
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();

        student1.name = "Sam";
        student1.rollNumber = 1;
        student1.phoneNumber = "775-234-9808";
        student1.address = "1234 Main Street.";
        student1.display();

        System.out.println("----------------------------------------");

        student1.name = "John";
        student1.rollNumber = 2;
        student1.phoneNumber = "213-204-5656";
        student1.address = "1010 Fresh Meadows.";
        student1.display();
    }
}
