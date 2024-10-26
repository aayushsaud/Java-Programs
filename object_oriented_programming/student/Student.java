package object_oriented_programming.student;

public class Student {
    private String name;
    private int studentID;
    private double grade;
    private String major;

    // Constructor with all fields
    public Student(String name, int studentID, double grade, String major) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
        this.major = major;
    }

    // Constructor with only name and ID, defaults grade to 0.0 and major to "Undeclared"
    public Student(String name, int studentID) {
        this(name, studentID, 0.0, "Undeclared");
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
        System.out.println("Major: " + major);
    }

    // Method to update the grade
    public void updateGrade(double newGrade) {
        if (newGrade >= 0.0 && newGrade <= 4.0) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        } else {
            System.out.println("Invalid grade. Please enter a grade between 0.0 and 4.0.");
        }
    }

    // Method to change the major
    public void changeMajor(String newMajor) {
        this.major = newMajor;
        System.out.println("Major changed to: " + major);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }
}