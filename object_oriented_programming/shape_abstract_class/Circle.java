package object_oriented_programming.shape_abstract_class;

// Circle class derived from Shape
public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of area calculation for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of perimeter calculation for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to display Circle-specific details
    @Override
    public void displayInfo() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        super.displayInfo();
    }
}