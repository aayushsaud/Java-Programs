import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User inputs a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = number;
        
        // Calculate the sum of digits
        while (temp != 0) {
            int digit = temp % 10;  // Get the last digit
            sum += digit;           // Add the digit to the sum
            temp /= 10;             // Remove the last digit
        }
        
        System.out.println("The sum of digits of " + number + " is: " + sum);
        
        scanner.close();
    }
}
