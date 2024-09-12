import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs fibonacci length
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();

        int first = 1;
        int second = 2;

        for (int i=1; i<= length; i++) {
            System.out.print(first + " ");
            
            // Calculating the next term
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}