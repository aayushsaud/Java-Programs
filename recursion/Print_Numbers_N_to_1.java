import java.util.Scanner;

public class Print_Numbers_N_to_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the number till which the program needs to print
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
          System.out.println("Please enter a number greater than 1!");
          scanner.close();
          return;
        }

        printNumbersNTo1(number);

        scanner.close();        
    }
    public static void printNumbersNTo1(int n) {
        if (n <= 0) {
          return;
        }
        System.out.println(n);
        printNumbersNTo1(n - 1);
    }
}