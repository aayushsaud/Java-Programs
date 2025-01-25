import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }

    public static boolean isPrime(int n) {
        // Edge cases: numbers less than 2 are not prime
        if (n < 2) return false;
        if (n == 2) return true; // 2 is prime
        if (n % 2 == 0) return false; // Even numbers greater than 2 are not prime

        // Check divisors from 3 to √n, skipping even numbers
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, n is prime
    }
}