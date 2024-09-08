import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User inputs a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reverse = 0;
        int temp = number;
        
        // Reverse the digits of the number
        while (temp != 0) {
            int digit = temp % 10;       // Get the last digit
            reverse = reverse * 10 + digit;  // Add the digit to reverse
            temp /= 10;                  // Remove the last digit
        }
        
        System.out.println("The reverse of " + number + " is: " + reverse);
        
        scanner.close();
    }
}

