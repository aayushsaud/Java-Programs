package object_oriented_programming.shape_abstract_class;

public class Main {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5.0);
        circle.displayInfo();

        System.out.println();

        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 7.0);
        rectangle.displayInfo();
    }
}