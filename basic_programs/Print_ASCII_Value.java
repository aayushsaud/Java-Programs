import java.util.Scanner;

public class Print_ASCII_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Cast the character to an integer to get the ASCII value
        int asciiValue = (int) ch;

        // Print the ASCII value
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
