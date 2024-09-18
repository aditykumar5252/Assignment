class Student {

    private String name;
    private int age;
    private char grade;

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println(); 
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create multiple Student objects
        Student student1 = new Student("Alice", 20, 'A');
        Student student2 = new Student("Bob", 22, 'B');
        Student student3 = new Student("Charlie", 19, 'C');

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
