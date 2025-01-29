import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a string
        System.out.print("Enter a string to reverse: ");
        String string = scanner.nextLine();

        // Converting String to Char Array
        char[] chars = string.toCharArray(); 
        int left = 0, right = string.length() - 1;

        while (left < right) {
            // Swapping characters at left and right pointers
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Moving the pointers towards the center
            left++;
            right--;
        }

        String reversedString = new String(chars);

        System.out.println("Your String: " + string);
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}