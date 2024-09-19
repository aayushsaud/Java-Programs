import java.util.Scanner;

public class Check_if_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a string
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        String reversed = "";
        
        // Reversing the String
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Checking if the String is a Palindrome
        if (input.equals(reversed))System.out.println(input + " is a Palindrome!");
        else System.out.println(input + " is not a Palindrome!");

        scanner.close();
    }
}
