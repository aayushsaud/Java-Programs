import java.util.Scanner;

public class Sum_of_First_N_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the input
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
          System.out.println("Please enter a positive number!");
          scanner.close();
          return;
        }
        int sum = sumOfNNumbers(number);
        System.out.println("The sum of the first " + number + " positive integers is: " + sum);
        scanner.close();
    }
    public static int sumOfNNumbers(int n) {
        if (n <= 0) {
          return 0;
        }
        return n + sumOfNNumbers(n - 1);
    }
}
