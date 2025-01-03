import java.util.Scanner;

public class Print_Numbers_N_To_1_Backtracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the number till which the program needs to print
        System.out.print("Enter a positive number greater than 1: ");
        int number = scanner.nextInt();

        if (number <= 1) {
          System.out.println("Please enter a number greater than 1!");
          scanner.close();
          return;
        }

        printNumbersNTo1(number, 1);

        scanner.close();
    }
    public static void printNumbersNTo1(int n, int current) {
        if (current > n) {
          return;
        }
        printNumbersNTo1(n , current + 1);
        System.out.println(current);
    }
}