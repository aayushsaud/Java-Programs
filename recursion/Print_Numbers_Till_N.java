import java.util.Scanner;

public class Print_Numbers_Till_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the number till which the program needs to print
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        printNumbersTill(1, number);

        scanner.close();
    }

    // Recursive method to print numbers from currentNumber to maxNumber
    public static void printNumbersTill(int currentNumber, int maxNumber) {
        if (currentNumber > maxNumber) return;
        System.out.println(currentNumber);
        printNumbersTill(currentNumber + 1, maxNumber);
    }
}