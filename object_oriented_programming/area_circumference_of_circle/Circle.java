package object_oriented_programming.area_circumference_of_circle;

public class Circle {
    private float radius;

    // Constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    // Method to calculate Area
    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }

    // Method to calculate Circumference
    public float calculateCircumference() {
        return (float) (2 * Math.PI * radius);
    }

    // Getter for Radius
    public float getRadius() {
        return radius;
    }

    // Setter for Radius
    public void setRadius(float radius) {
        this.radius = radius;
    }
}
