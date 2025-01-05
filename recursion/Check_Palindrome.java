import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the input
        System.out.print("Enter a String: ");
        String string = scanner.nextLine().toLowerCase();
        ;

        boolean isPalindrome = palindrome(string, 0);

        if (isPalindrome) {
            System.out.println(string + " is a Palindrome!");
        }
        else {
            System.out.println(string + " is not a Palindrome!");
        }
        scanner.close();
    }

    public static boolean palindrome(String string, int index) {
        if (index >= string.length() / 2) {
	        return true;
        }
        if (string.charAt(index) != string.charAt(string.length() - 1 - index)) {
	        return false;
	      }
        return palindrome(string, index + 1);
    }
}