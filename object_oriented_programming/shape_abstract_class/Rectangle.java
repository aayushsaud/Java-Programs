package object_oriented_programming.shape_abstract_class;

// Rectangle class derived from Shape
public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of area calculation for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementation of perimeter calculation for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display Rectangle-specific details
    @Override
    public void displayInfo() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        super.displayInfo();
    }
}