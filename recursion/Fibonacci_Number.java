import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the number till which the program needs to print
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number < 0) {
          System.out.println("Please enter a positive number!");
          scanner.close();
          return;
        }

        int fibonacciNumber = fibonacci(number);
        System.out.println("Fibonacci number at " + number + " is " + fibonacciNumber);
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) { 
          return n;
        }
        return fibonacci(n - 1) + fibonacci(n -2);
    }
}