import java.util.Scanner;

public class Print_Numbers_Till_N_Backtracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the number till which the program needs to print
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        printNumbersTill(number);

        scanner.close();
    }

    public static void printNumbersTill(int number) {
        if (number <= 0) return;
        printNumbersTill(number - 1); // Back-tracking prints in reverse order
        System.out.println(number);
    }
}