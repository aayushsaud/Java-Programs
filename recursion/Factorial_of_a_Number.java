import java.util.Scanner;

public class Factorial_of_a_Number {
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

        int factorial = factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
        scanner.close(); 
    }
    public static int factorial(int n) {
        if (n == 0) {
          return 1;
        }
        return n * factorial(n - 1);
    }
}