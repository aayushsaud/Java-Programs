package object_oriented_programming.area_of_rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for Rectangle Length
        System.out.print("Enter Rectangle Length: ");
        float length = scanner.nextFloat();

        // Asking user for Rectangle Breadth
        System.out.print("Enter Rectangle Breadth: ");
        float breadth = scanner.nextFloat();

        var rectangle = new Rectangle(length, breadth);

        // Printing area and perimeter of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());

        scanner.close();
    }
}