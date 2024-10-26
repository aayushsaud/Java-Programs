package object_oriented_programming.student;

public class Main {
    public static void main(String[] args) {
        // Creating a Student with full details
        Student student1 = new Student("Alice", 1001, 3.5, "Computer Science");
        student1.displayDetails();

        System.out.println();

        // Creating a Student with only name and ID, defaults used for grade and major
        Student student2 = new Student("Bob", 1002);
        student2.displayDetails();

        System.out.println();

        // Updating grade and changing major for student2
        student2.updateGrade(3.8);
        student2.changeMajor("Mathematics");
        student2.displayDetails();
    }
}