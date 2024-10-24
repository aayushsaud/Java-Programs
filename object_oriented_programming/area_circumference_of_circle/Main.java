package object_oriented_programming.area_circumference_of_circle;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for Circle Radius
        System.out.print("Enter Circle Radius: ");
        float radius = scanner.nextFloat();

        var circle = new Circle(radius);

        // Printing area and circumference of the circle
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());

        scanner.close();
    }
}
