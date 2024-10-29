package object_oriented_programming.shape_abstract_class;

public abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Abstract method to calculate perimeter
    public abstract double calculatePerimeter();

    // Method to display shape information
    public void displayInfo() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}