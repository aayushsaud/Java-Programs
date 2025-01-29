import java.util.Scanner;

public class Palindrome_String_Check{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a string
        System.out.print("Enter a word: ");
        String string = scanner.nextLine().toLowerCase();

        int left = 0;
        int right = string.length() - 1;
        boolean palindrome = true;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Checking if the String is a Palindrome
        if (palindrome) { 
            System.out.println(string + " is a Palindrome!");
        }
        else {
            System.out.println(string + " is not a Palindrome!");
        }

        scanner.close();
    }
}
