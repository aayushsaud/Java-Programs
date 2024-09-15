import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter two numbers
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        int num = (num1 < num2) ? num1 : num2;

        int GCD = 0;

        // Finding the Greatest Common Divisor
        for (int i = 1; i <= num; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println("Greatest Common Divisor between " + num1 + " and " + num2 + " is " + GCD + "!");

        scanner.close();
    }
}
