import java.util.Scanner;

public class Check_if_Number_is_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        
        int number = inputNumber;
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;  // Getting the last digit
            reversed = reversed * 10 + digit;  // Building the reversed number
            number /= 10;  // Removing the last digit
        }

        // Checking if the Number is a Palindrome
        if (inputNumber == reversed) System.out.println(inputNumber + " is a Palindrome!");
        else System.out.println(inputNumber + " is not a Palindrome!");

        scanner.close();
    }
}
