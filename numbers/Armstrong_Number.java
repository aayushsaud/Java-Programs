import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        // Calculating the number of digits
        int digits = 0;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Calculating the sum of powers of digits
        int sum = 0;
        temp = number;
        while (temp > 0) {
            int digit = temp % 10; // Getting the last digit
            sum += Math.pow(digit, digits); // Adding digit^digits to sum
            temp /= 10; // Removing the last digit
        }

        // Checking if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
