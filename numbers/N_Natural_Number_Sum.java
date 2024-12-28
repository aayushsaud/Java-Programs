import java.util.Scanner;

public class N_Natural_Number_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for the number of natural numbers to sum
        System.out.print("Enter the number of natural numbers to sum: ");
        int num = scanner.nextInt();

        int sum = 0;

        // Adding the first N natural numbers
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + num + " natural numbers is " + sum + "!");

        scanner.close();
    }
}
