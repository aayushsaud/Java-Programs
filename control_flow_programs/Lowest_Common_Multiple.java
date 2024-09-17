import java.util.Scanner;

public class Lowest_Common_Multiple{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter two numbers
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        int num = (num1 > num2) ? num1 : num2;

        int LCM = num;
        
        // Finding the Lowest Common Multiple
        while (!(LCM % num1 == 0 && LCM % num2 == 0)) {
            LCM += num;
        }
        System.out.println("Lowest Common Multiple for " + num1 + " and " + num2 + " is " + LCM + "!");

        scanner.close();
    }
}
