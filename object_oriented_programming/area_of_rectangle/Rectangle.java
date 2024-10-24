package object_oriented_programming.area_of_rectangle;

public class Rectangle {
    private float length;
    private float breadth;

    // Constructor
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate Area
    public float calculateArea() {
        return length * breadth;
    }

    // Method to calculate Perimeter
    public float calculatePerimeter() {
        return 2*(length * breadth);
    }

    // Getters for Length and Breadth
    public float getLength() {
        return length;
    }

    public float getBreadth() {
        return breadth;
    }

    // Setters for Length and Breadth
    public void setLength(float length) {
        this.length = length;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
}