import java.util.Scanner;

public class Factorial_of_a_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        int factorial = number;
        for (int i = number - 1; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
