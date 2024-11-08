package object_oriented_programming.basic_calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Addition
        System.out.println("Addition:");
        System.out.println("5 + 10 = " + calculator.add(5, 10));
        System.out.println("3.5 + 4.2 = " + calculator.add(3.5, 4.2));
        System.out.println("2 + 3 + 4 = " + calculator.add(2, 3, 4));

        System.out.println();

        // Subtraction
        System.out.println("Subtraction:");
        System.out.println("20 - 10 = " + calculator.subtract(20, 10));
        System.out.println("10.5 - 4.2 = " + calculator.subtract(10.5, 4.2));
        System.out.println("15 - 5 - 3 = " + calculator.subtract(15, 5, 3));

        System.out.println();

        // Multiplication
        System.out.println("Multiplication:");
        System.out.println("5 * 10 = " + calculator.multiply(5, 10));
        System.out.println("2.5 * 3.2 = " + calculator.multiply(2.5, 3.2));
        System.out.println("3 * 4 * 5 = " + calculator.multiply(3, 4, 5));

        System.out.println();

        // Division
        System.out.println("Division:");
        System.out.println("20 / 4 = " + calculator.divide(20, 4));
        System.out.println("15.5 / 3.1 = " + calculator.divide(15.5, 3.1));
        System.out.println("Division by zero check: " + calculator.divide(10, 0));
    }
}